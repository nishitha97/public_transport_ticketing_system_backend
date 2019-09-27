package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Bus;
import com.csse_we_32.public_transport_ticketing_system.domain.BusStand;

import java.util.List;
import java.util.Optional;

public interface BusStandService {
    List<BusStand> getAllStands();
    Optional<BusStand> getStandById(String id);
    BusStand save(BusStand busStand);
}
