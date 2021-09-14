package io.github.gbalanyi.spring.framework.event;

import java.time.Clock;

import org.springframework.context.ApplicationEvent;

public class GreetingEvent extends ApplicationEvent {

    private final String name;

    public GreetingEvent(Object source, String name, Clock clock) {
        super(source, clock);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
