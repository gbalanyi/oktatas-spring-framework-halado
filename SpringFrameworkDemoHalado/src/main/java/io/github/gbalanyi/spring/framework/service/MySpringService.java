package io.github.gbalanyi.spring.framework.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final TimestampService timestampService;

    public MySpringService(TimestampService timestampService) {
        this.timestampService = timestampService;
    }

    @PostConstruct
    protected void initBean() {
        System.out.println(String.format("Initialized '%s' bean", this.getClass().getSimpleName()));
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", timestampService.getCurrentTimestamp(), name));
    }
}
