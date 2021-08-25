package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.ZoneId;

import org.springframework.stereotype.Service;

@Service
public class UtcTimestampService extends BaseTimestampService {

    @Override
    protected Clock getClock() {
        return Clock.system(ZoneId.of("UTC"));
    }
}
