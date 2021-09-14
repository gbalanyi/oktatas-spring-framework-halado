package io.github.gbalanyi.spring.framework.service;

import io.github.gbalanyi.spring.framework.event.GreetingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class GreetingObserverService {

    @EventListener
    public void handleGreetingEvent(GreetingEvent greetingEvent) {
        System.out.println(String.format("Handle greeting event. Timestamp: %d, Source: %s, Name: %s",
                greetingEvent.getTimestamp(),
                greetingEvent.getSource().getClass().getSimpleName(),
                greetingEvent.getName()));
    }
}
