package com.csse_we_32.public_transport_ticketing_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PublicTransportTicketingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublicTransportTicketingSystemApplication.class, args);
    }

}
