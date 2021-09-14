package io.github.gbalanyi.spring.framework.config;

import java.time.Clock;

import io.github.gbalanyi.spring.framework.service.TimestampService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "io.github.gbalanyi.spring.framework")
public class BaseApplicationConfig {

    // A profil aktiválásához környezeti változóként adjuk meg az aktiváló paramétert: spring.profiles.active=utc
    @Bean("timestampService")
    @Profile("utc")
    public TimestampService utcTimestampService() {
        return new TimestampService(Clock.systemUTC());
    }

    @Bean("timestampService")
    public TimestampService defaultTimestampService() {
        return new TimestampService(Clock.systemDefaultZone());
    }
}
