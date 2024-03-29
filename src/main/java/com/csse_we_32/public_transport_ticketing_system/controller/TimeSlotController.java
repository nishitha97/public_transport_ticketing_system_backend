package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.TimeSlotService;
import com.csse_we_32.public_transport_ticketing_system.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @DeleteMapping("/delete")
    public ResponseEntity<?>  delete( @RequestBody TimeSlot timeSlot) throws Exception {
        timeSlotService.deleteById(timeSlot.getId());
        return ResponseEntity.status(HttpStatus.OK).body(timeSlot);

    }


    @GetMapping()
    public ResponseEntity<List<TimeSlot>> getTimeSlots() {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.getAllTimeSlots());

    }

    @GetMapping("/getByFrom/{from}")
    public ResponseEntity<List<TimeSlot>> getTimeSlotByStand(@PathVariable("from") String from) {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.findByFrom(from));

    }

    @GetMapping("/getByFromAndDay/{from}/{day}")
    public ResponseEntity<List<TimeSlot>> getTimeSlotByStandAndDay(@PathVariable("from") String from,@PathVariable("day") String day) {

        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.findByFromAndDay(from,day));

    }

    @GetMapping("/getByFromAndDate/{from}/{date}")
    public ResponseEntity<List<TimeSlot>> getTimeSlotByStandAndDate(@PathVariable("from") String from,@PathVariable("date") Date date) {
        String day=DateUtil.getDayByDate(date);
        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.findByFromAndDay(from,day));

    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Optional<TimeSlot>> findById(@PathVariable("id") String id) {
        return ResponseEntity.status(HttpStatus.OK).body(timeSlotService.finById(id));
    }



}
