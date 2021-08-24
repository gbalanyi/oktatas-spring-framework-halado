package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(LocalTimestampService.ORDER)
public class LocalTimestampService extends BaseTimestampService {

    protected static final int ORDER = 1;

    @Override
    public Integer getOrderNumber() {
        return ORDER;
    }

    @Override
    protected Clock getClock() {
        return Clock.systemDefaultZone();
    }
}
