package io.github.gbalanyi.spring.framework.service;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class MySpringService implements ApplicationListener<ContextRefreshedEvent> {

    private final TimestampService timestampService;

    public MySpringService(TimestampService timestampService) {
        this.timestampService = timestampService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ApplicationContext refreshed.");
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", timestampService.getCurrentTimestamp(), name));
    }
}
