package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Component;

@Component
public class TimestampService {

    public String getCurrentTimestamp() {
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now(getClock()).truncatedTo(ChronoUnit.SECONDS));
    }

    protected Clock getClock() {
        return Clock.systemDefaultZone();
    }
}
