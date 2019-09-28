package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.Travel;
import com.csse_we_32.public_transport_ticketing_system.repository.TravelRepository;
import com.csse_we_32.public_transport_ticketing_system.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    TravelRepository travelRepository;
    @Autowired
    BusStandServiceImpl busStandService;

    @Override
    public List<Travel> getAllTravels() {
        return travelRepository.findAll();
    }

    @Override
    public Optional<Travel> getTravelById(String id) {
        return travelRepository.findById(id);
    }


}
