package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;

import java.util.List;
import java.util.Optional;

public interface TimeSlotService {
    List<TimeSlot> getAllTimeSlots();
    List<TimeSlot> findByFrom(String from);
    List<TimeSlot> findByFromAndDay(String from,String day);
    TimeSlot save(TimeSlot timeSlot);
    Optional<TimeSlot> finById(String id);
    void deleteById(String id);
}
