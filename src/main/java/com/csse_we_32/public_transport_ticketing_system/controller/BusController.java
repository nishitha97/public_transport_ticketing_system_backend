package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.Bus;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    @Autowired
    BusService busService;

    @PostMapping("/save")
    public ResponseEntity<Bus> save(Bus bus) {
        return ResponseEntity.status(HttpStatus.OK).body(busService.save(bus));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bus>> getBusses() {
        return ResponseEntity.status(HttpStatus.OK).body(busService.getAllBusses());
    }
    @GetMapping("stand/{stand}")
    public ResponseEntity<List<Bus>> getBusesFindbyStand(@PathVariable("stand") String stand) {
        return ResponseEntity.status(HttpStatus.OK).body(busService.findByBusStand(stand));
    }

    @GetMapping("regNumber/{regNumber}")
    public ResponseEntity<Optional<Bus>> getBusbyFindregNumber(@PathVariable("regNumber") String regNumber) {
        return ResponseEntity.status(HttpStatus.OK).body(busService.findByRegNumber(regNumber));
    }



}
