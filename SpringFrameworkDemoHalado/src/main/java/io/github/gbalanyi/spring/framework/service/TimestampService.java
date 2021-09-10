package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TimestampService {

    public TimestampService() {
        System.out.println(System.currentTimeMillis() + " Created TimestampService");
    }

    public String getCurrentTimestamp() {
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now(getClock()).truncatedTo(ChronoUnit.SECONDS));
    }

    protected Clock getClock() {
        return Clock.systemDefaultZone();
    }
}
