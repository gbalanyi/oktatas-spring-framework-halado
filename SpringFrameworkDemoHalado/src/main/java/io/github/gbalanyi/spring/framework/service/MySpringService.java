package io.github.gbalanyi.spring.framework.service;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final BaseTimestampService baseTimestampService;

    public MySpringService(BaseTimestampService baseTimestampService) {
        this.baseTimestampService = baseTimestampService;
    }

    public void greeting(String name) {
        System.out.println(String.format("%s Hello %s!", baseTimestampService.getCurrentTimestamp(), name));
    }
}
