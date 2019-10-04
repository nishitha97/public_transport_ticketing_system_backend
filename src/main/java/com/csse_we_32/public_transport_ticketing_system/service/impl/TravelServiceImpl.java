package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import com.csse_we_32.public_transport_ticketing_system.domain.Travel;
import com.csse_we_32.public_transport_ticketing_system.repository.TimeSlotRepository;
import com.csse_we_32.public_transport_ticketing_system.repository.TravelRepository;
import com.csse_we_32.public_transport_ticketing_system.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    TravelRepository travelRepository;

    @Autowired
    TimeSlotRepository timeSlotRepository;



    @Override
    public List<Travel> getAllTravels() {
        return travelRepository.findAll();
    }

    @Override
    public Optional<Travel> getTravelById(String id) {
        return travelRepository.findById(id);
    }

    @Override
    public Travel getTravelByTimeSlotAndDate(String timeSlotId,String date) {
        TimeSlot timeSlot=timeSlotRepository.findById(timeSlotId).get();
        Travel travel= travelRepository.findByTimeSlotIdAndDate(timeSlotId,date).get();

        if(travel==null){
            travel=travelRepository.save(new Travel(timeSlot.getFrom(),timeSlot.getTo(),new Date(),timeSlotId,timeSlot.getLeaveTime(),timeSlot.getArrivalTime(),timeSlot.getFrom(),timeSlot.getBusRegNumber(),timeSlot.getRouteId()));
                    //String busStand, String to, Date date, String timeSlotId, String leaveTime, String arrivalTime, String currentHalt, String regNumber, String routeID

        }

        return travel;
    }


}
