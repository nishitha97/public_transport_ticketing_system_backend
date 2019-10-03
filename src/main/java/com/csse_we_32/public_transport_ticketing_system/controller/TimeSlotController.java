package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.TimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/timeSlots")
public class TimeSlotController {

    @Autowired
    TimeSlotService timeSlotService;

    @PostMapping("/save")
    public ResponseEntity<?>  save(@Valid @RequestBody TimeSlot timeSlot) throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.save(timeSlot));


    }


    @GetMapping()
    public ResponseEntity<List<TimeSlot>> getTimeSlots() {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.getAllTimeSlots());

    }

    @PostMapping("/getByFrom/{from}")
    public ResponseEntity<List<TimeSlot>> getTimeSlotByStand(@PathVariable("from") String from) {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.findByFrom(from));

    }

    @PostMapping("/getByFromAndDay/{from}/{day}")
    public ResponseEntity<List<TimeSlot>> getTimeSlotByStandAndDay(@PathVariable("from") String from,@PathVariable("day") String day) {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.findByFromAndDay(from,day));

    }

}
