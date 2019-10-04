package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.Seat;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/seats")
public class SeatController {
    @Autowired
    SeatService seatService;

    @GetMapping()
    public ResponseEntity<List<Seat>> getSeats() {

        return ResponseEntity.status(HttpStatus.OK).body(seatService.getAllSeats());

    }

    @GetMapping("/seatBookingTableData")
    public ResponseEntity<List<Seat>> getSeatBookingTableData(String travelId,String from,String to){

        return ResponseEntity.status(HttpStatus.OK).body(seatService.getBookedSeatPerTravel(travelId,from,to));
    }

}
