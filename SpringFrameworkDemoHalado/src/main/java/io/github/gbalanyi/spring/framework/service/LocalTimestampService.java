package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;

import org.springframework.stereotype.Service;

@Service
public class LocalTimestampService extends BaseTimestampService {

    @Override
    protected Clock getClock() {
        return Clock.systemDefaultZone();
    }
}
