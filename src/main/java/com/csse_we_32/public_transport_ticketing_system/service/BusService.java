package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Bus;
import com.csse_we_32.public_transport_ticketing_system.domain.User;

import java.util.List;
import java.util.Optional;

public interface BusService {
    List<Bus> getAllBusses();
    Optional<Bus> findByRegNumber(String regNumber);
    List<Bus> findByBusStand(String stand);
    Bus save(Bus bus);

}
