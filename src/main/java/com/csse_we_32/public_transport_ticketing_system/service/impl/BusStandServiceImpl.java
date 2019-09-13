package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.BusStand;
import com.csse_we_32.public_transport_ticketing_system.repository.BusStandRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import com.csse_we_32.public_transport_ticketing_system.service.BusStandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStandServiceImpl implements BusStandService {
    @Autowired
    BusStandRepository busStandRepository;

    @Override
    public List<BusStand> getAllStands() {
        return busStandRepository.findAll();
    }
}
