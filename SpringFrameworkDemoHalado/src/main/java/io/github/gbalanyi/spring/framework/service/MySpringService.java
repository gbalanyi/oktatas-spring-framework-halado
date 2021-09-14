package io.github.gbalanyi.spring.framework.service;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final TimestampService timestampService;

    public MySpringService(TimestampService timestampService) {
        this.timestampService = timestampService;
    }

    @EventListener
    public void myEventHandler(ContextRefreshedEvent event) {
        System.out.println(String.format("%d ApplicationContext refreshed.", event.getTimestamp()));
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", timestampService.getCurrentTimestamp(), name));
    }
}
