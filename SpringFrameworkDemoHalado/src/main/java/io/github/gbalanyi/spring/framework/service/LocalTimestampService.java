package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(LocalTimestampService.QUALIFIER)
public class LocalTimestampService extends BaseTimestampService {

    public static final String QUALIFIER = "LOCAL";

    @Override
    protected Clock getClock() {
        return Clock.systemDefaultZone();
    }
}
