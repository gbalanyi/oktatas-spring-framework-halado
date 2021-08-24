package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.ZoneId;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(UtcTimestampService.ORDER)
public class UtcTimestampService extends BaseTimestampService {

    protected static final int ORDER = 2;

    @Override
    public Integer getOrderNumber() {
        return ORDER;
    }

    @Override
    protected Clock getClock() {
        return Clock.system(ZoneId.of("UTC"));
    }
}
