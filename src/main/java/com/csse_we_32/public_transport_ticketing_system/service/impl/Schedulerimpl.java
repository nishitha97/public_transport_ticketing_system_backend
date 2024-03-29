package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.repository.TimeSlotRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class Schedulerimpl {
    @Autowired
    TimeSlotRepository timeSlotRepository;
    private static Logger logger = LoggerFactory.getLogger(Schedulerimpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        logger.info("The time is now {}", dateFormat.format(new Date()));
    }

    /*
    update next 6 days
    travel details
    */

    public void updateTravelDetails() {


    }

}
