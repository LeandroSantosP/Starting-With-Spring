package com.example.restservice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class ScheduledTasksCurrentTime {
    private final SimpleDateFormat data = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportTime() {
        Logger log = LoggerFactory.getLogger(ScheduledTasksCurrentTime.class);
        log.info("The time is now: {}", data.format(new Date()));
    }
}
