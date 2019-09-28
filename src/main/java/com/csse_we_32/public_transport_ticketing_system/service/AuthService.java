package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.security.JwtRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthService {
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception;
}
