package io.github.gbalanyi.spring.framework.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final TimestampService timestampService;

    public MySpringService(@Lazy TimestampService timestampService) {
        System.out.println(System.currentTimeMillis() + " Created MySpringService");
        this.timestampService = timestampService;
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", timestampService.getCurrentTimestamp(), name));
    }
}
