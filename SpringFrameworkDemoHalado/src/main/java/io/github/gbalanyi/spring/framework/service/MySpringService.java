package io.github.gbalanyi.spring.framework.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final List<BaseTimestampService> baseTimestampServices;

    public MySpringService(List<BaseTimestampService> baseTimestampServices) {
        this.baseTimestampServices = baseTimestampServices;
    }

    public void greeting(String name) {
        for (BaseTimestampService baseTimestampService : baseTimestampServices) {
            System.out.println(String.format("%s Hello %s!", baseTimestampService.getCurrentTimestamp(), name));
        }
    }
}
