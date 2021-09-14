package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;

import io.github.gbalanyi.spring.framework.event.GreetingEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final TimestampService timestampService;

    private final ApplicationEventPublisher applicationEventPublisher;

    public MySpringService(TimestampService timestampService, ApplicationEventPublisher applicationEventPublisher) {
        this.timestampService = timestampService;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", timestampService.getCurrentTimestamp(), name));
        applicationEventPublisher.publishEvent(new GreetingEvent(this, name, Clock.systemDefaultZone()));
    }
}
