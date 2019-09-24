package com.csse_we_32.public_transport_ticketing_system.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public String disply(){
        System.out.println("hello");
        return "hello";
    }
}
