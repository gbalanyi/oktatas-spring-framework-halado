package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TimestampService {

    private final String zoneId;

    public TimestampService(@Value("${my.application.zone-id}") String zoneId) {
        this.zoneId = zoneId;
    }

    public String getCurrentTimestamp() {
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now(getClock()).truncatedTo(ChronoUnit.SECONDS));
    }

    protected Clock getClock() {
        return Clock.system(ZoneId.of(zoneId));
    }
}
