package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.Bus;
import com.csse_we_32.public_transport_ticketing_system.repository.BusRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    BusRepository busRepository;

    @Override
    public List<Bus> getAllBusses() {
        return busRepository.findAll();
    }

    @Override
    public Optional<Bus> findByRegNumber(String regNumber) {
        return busRepository.findByRegNumber(regNumber);
    }

    @Override
    public List<Bus> findByBusStand(String stand) {
        return busRepository.findByBusStand(stand);
    }

    @Override
    public Bus save(Bus bus) {
        return busRepository.save(bus);
    }


}
