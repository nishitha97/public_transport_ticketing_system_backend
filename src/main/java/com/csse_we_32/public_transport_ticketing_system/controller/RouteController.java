package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.Route;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/routes")
public class RouteController {

    @Autowired
    RouteService routeService;

    @GetMapping()
    public ResponseEntity<List<Route>> getRoutes() {

        return ResponseEntity.status(HttpStatus.OK).body(routeService.getAllRoutes());

    }

    @PostMapping("/save")
    public ResponseEntity<Route> save(@RequestBody Route route) {
        return ResponseEntity.status(HttpStatus.OK).body(routeService.save(route));

    }


}
