package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import com.csse_we_32.public_transport_ticketing_system.domain.Travel;
import com.csse_we_32.public_transport_ticketing_system.repository.TimeSlotRepository;
import com.csse_we_32.public_transport_ticketing_system.repository.TravelRepository;
import com.csse_we_32.public_transport_ticketing_system.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public Travel getTravelByTimeSlotAndDate(String timeSlotId,Date dateT) {
       // SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
////

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,dateT.getYear());
        cal.set(Calendar.MONTH,dateT.getMonth());
        cal.set(Calendar.DATE,dateT.getDate());

        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();



        Travel travelT=null;
        TimeSlot timeSlot=timeSlotRepository.findById(timeSlotId).get();
        List<Travel> travelList= travelRepository.findByTimeSlotIdAndDate(timeSlotId,date);
        if(travelList==null||travelList.isEmpty()){
            travelT=travelRepository.save(new Travel(timeSlot.getFrom(),timeSlot.getTo(),date,timeSlotId,timeSlot.getLeaveTime(),timeSlot.getArrivalTime(),timeSlot.getFrom(),timeSlot.getBusRegNumber(),timeSlot.getRouteId()));

        }else {
             travelT=travelList.get(0);
        }



        return travelT;
    }


}
