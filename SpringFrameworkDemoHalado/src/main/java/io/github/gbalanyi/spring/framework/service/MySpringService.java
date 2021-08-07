package io.github.gbalanyi.spring.framework.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MySpringService {

    private final Map<String, BaseTimestampService> baseTimestampServices;

    public MySpringService(Map<String, BaseTimestampService> baseTimestampServices) {
        this.baseTimestampServices = baseTimestampServices;
    }

    public void greeting(String name) {
        for (Map.Entry<String, BaseTimestampService> baseTimestampServiceEntry : baseTimestampServices.entrySet()) {
            System.out.println(String.format("Bean name: %s, %s Hello %s!",
                    baseTimestampServiceEntry.getKey(),
                    baseTimestampServiceEntry.getValue().getCurrentTimestamp(),
                    name));
        }
    }
}
