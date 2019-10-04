package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.SmartCard;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.SmartCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/smartCards")
public class SmartCardController {

    @Autowired
    SmartCardService smartCardService;

    @GetMapping()
    public ResponseEntity<List<SmartCard>> getSmartCards() {

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getAllSmartCards());

    }

    @GetMapping("/smartCardId/{id}")
    public ResponseEntity<Optional<SmartCard>> getSmartCardById(@PathVariable("id") String id) {

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getById(id));

    }

    @GetMapping("/userId/{id}")
    public ResponseEntity<Optional<SmartCard>> getSmartCardByUserId(@PathVariable("id") String userId) {

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getByUserId(userId));

    }

    @PostMapping("/save")
    public ResponseEntity<SmartCard> save(SmartCard smartCard) {

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.save(smartCard));

    }

}
