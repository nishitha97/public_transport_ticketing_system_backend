package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Halt;
import com.csse_we_32.public_transport_ticketing_system.domain.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> getAllSeats();
    List<Seat> getAllSeatPerTravel(String travelId,String from,String to);
    List<Seat> getBookedSeatPerTravel(String travelId,String from,String to);
    List<Seat> getAvailableSeatPerTravel(String travelId,String from,String to);
    List<Seat> findByTravelId(String travelId);


}
