package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.BusStand;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.BusStandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/bus_stands")
public class BusStandController {

    @Autowired
    BusStandService busStandService;

    @PostMapping("/save")
    public ResponseEntity<BusStand> saveBusStands(BusStand busStand) {

        return ResponseEntity.status(HttpStatus.OK).body(busStandService.save(busStand));

    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<BusStand>> getBusStandById(@PathVariable("id") String id) {

        return ResponseEntity.status(HttpStatus.OK).body(busStandService.getStandById(id));

    }

    @GetMapping("/all")
    public ResponseEntity<List<BusStand>> getBusStands() {

        return ResponseEntity.status(HttpStatus.OK).body(busStandService.getAllStands());

    }

}
