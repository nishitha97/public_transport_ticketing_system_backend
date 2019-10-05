package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.DataClasses.SeatSaveData;
import com.csse_we_32.public_transport_ticketing_system.domain.Seat;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/seatBookingTableData/{travelId}/{from}/{to}")
    public ResponseEntity<List<Seat>> getSeatBookingTableData(@PathVariable("travelId") String travelId,@PathVariable("from") String from,@PathVariable("to") String to){

        return ResponseEntity.status(HttpStatus.OK).body(seatService.getALLSeatPerTravel(travelId,from,to));
    }



    @GetMapping("/getJourneys/{smartCardId}")
    public ResponseEntity<List<Seat>>  getJourneys(@PathVariable("smartCardId") String smartCardId) {

        return ResponseEntity.status(HttpStatus.OK).body(seatService.findBySmartCardId(smartCardId));

    }

    @PostMapping("/bookNow")
    public ResponseEntity<List<Seat>>  addAllBookedSeats(@RequestBody SeatSaveData seatSaveData) {
        List<Seat> response=new ArrayList<>();
        for(Seat seat:seatSaveData.getSeats()){
            Seat seatR=seatService.save(seat);
            response.add(seatR);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }


}
