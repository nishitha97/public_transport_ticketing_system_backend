package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.Travel;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/travels")
public class TravelController {

    @Autowired
    TravelService travelService;

    @GetMapping()
    public ResponseEntity<List<Travel>> getTravels() {

        return ResponseEntity.status(HttpStatus.OK).body(travelService.getAllTravels());

    }

    @GetMapping("get/{travelId}/{date}")
    public ResponseEntity<Travel> getTravel(@PathVariable("travelId") String travelId,@PathVariable("date") String date) {

        return ResponseEntity.status(HttpStatus.OK).body(travelService.getTravelByTimeSlotAndDate(travelId,date));

    }

}
