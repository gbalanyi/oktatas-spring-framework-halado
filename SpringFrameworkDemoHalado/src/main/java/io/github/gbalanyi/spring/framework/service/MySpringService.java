package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final TimestampService timestampService;

    public MySpringService(TimestampService timestampService) {
        this.timestampService = timestampService;
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", timestampService.getCurrentTimestamp(), name));
    }
}
