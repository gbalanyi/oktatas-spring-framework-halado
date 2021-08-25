package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(UtcTimestampService.QUALIFIER)
public class UtcTimestampService extends BaseTimestampService {

    public static final String QUALIFIER = "UTC";

    @Override
    protected Clock getClock() {
        return Clock.system(ZoneId.of("UTC"));
    }
}
