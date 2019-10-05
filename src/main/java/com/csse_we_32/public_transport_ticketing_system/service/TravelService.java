package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Travel;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TravelService {
    List<Travel> getAllTravels();
    Optional<Travel> getTravelById(String id);
    Travel getTravelByTimeSlotAndDate(String travelId, Date date);
}
