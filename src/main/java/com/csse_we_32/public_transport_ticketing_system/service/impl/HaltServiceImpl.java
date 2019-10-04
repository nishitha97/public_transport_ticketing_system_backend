package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.Halt;
import com.csse_we_32.public_transport_ticketing_system.domain.Seat;
import com.csse_we_32.public_transport_ticketing_system.repository.HaltRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import com.csse_we_32.public_transport_ticketing_system.service.HaltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HaltServiceImpl implements HaltService {

    @Autowired
    HaltRepository haltRepository;

    @Override
    public List<Halt> getAllHalts() {
        return haltRepository.findAll();
    }



}
