package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Bus;
import com.csse_we_32.public_transport_ticketing_system.domain.User;

import java.util.List;

public interface BusService {
    List<Bus> getAllBusses();
}
