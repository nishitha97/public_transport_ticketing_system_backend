package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.SmartCard;
import com.csse_we_32.public_transport_ticketing_system.repository.SmartCardRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import com.csse_we_32.public_transport_ticketing_system.service.SmartCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartCardServiceImpl implements SmartCardService {

    @Autowired
    SmartCardRepository smartCardRepository;

    @Override
    public List<SmartCard> getAllSmartCards() {
        return smartCardRepository.findAll();
    }
}