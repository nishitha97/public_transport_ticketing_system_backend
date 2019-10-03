package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import com.csse_we_32.public_transport_ticketing_system.repository.TimeSlotRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import com.csse_we_32.public_transport_ticketing_system.service.TimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeSlotServiceImpl implements TimeSlotService {

    @Autowired
    TimeSlotRepository timeSlotRepository;

    @Override
    public List<TimeSlot> getAllTimeSlots() {
        return timeSlotRepository.findAll();
    }

    @Override
    public List<TimeSlot> findByFrom(String from) {
        return timeSlotRepository.findByFrom(from);
    }

    @Override
    public List<TimeSlot> findByFromAndDay(String from,String day) {
        return timeSlotRepository.findByFromAndDay(from,day);
    }

    @Override
    public TimeSlot save(TimeSlot timeSlot) {
        return timeSlotRepository.save(timeSlot);
    }
}
