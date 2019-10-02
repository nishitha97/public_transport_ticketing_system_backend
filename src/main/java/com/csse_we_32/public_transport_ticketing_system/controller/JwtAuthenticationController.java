package com.csse_we_32.public_transport_ticketing_system.controller;

import com.csse_we_32.public_transport_ticketing_system.security.*;
import com.csse_we_32.public_transport_ticketing_system.service.impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JwtAuthenticationController {
    @Autowired
    AuthServiceImpl authService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
        return authService.createAuthenticationToken(authenticationRequest);
    }



}
