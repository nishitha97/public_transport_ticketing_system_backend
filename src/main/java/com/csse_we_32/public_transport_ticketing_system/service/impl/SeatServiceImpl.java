package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.Halt;
import com.csse_we_32.public_transport_ticketing_system.domain.Seat;
import com.csse_we_32.public_transport_ticketing_system.domain.Travel;
import com.csse_we_32.public_transport_ticketing_system.repository.SeatRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import com.csse_we_32.public_transport_ticketing_system.service.HaltService;
import com.csse_we_32.public_transport_ticketing_system.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    RouteServiceImpl routeService;

    @Autowired
    TravelServiceImpl travelService;
    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public List<Seat> getAllSeatPerTravel(String travelId, String to, String from) {
        return null;
    }

    @Override
    public List<Seat> getBookedSeatPerTravel(String travelId, String from, String to) {
        Travel travel=travelService.getTravelById(travelId).get();
        List<Halt> haltList=routeService.getByRouteId(travel.getRouteID()) .get().getHaltArray();
        List<Halt>BookHaltList= HaltService.getAllHalts(from,to,haltList);
        List<Seat> AllBookedSeats=seatRepository.findByTravelId(travelId);
        List<Seat> actualBookedSeats=new ArrayList<>();
        for(Seat seat:AllBookedSeats){
            List<Halt> currentSeatHaltList=HaltService.getAllHalts(seat.getFrom(),seat.getTo(),haltList);
            for(Halt halt:BookHaltList){
                if(currentSeatHaltList.contains(halt.getName())){
                    actualBookedSeats.add(seat);
                    break;
                }
            }
        }

        return actualBookedSeats;
    }

    @Override
    public List<Seat> getALLSeatPerTravel(String travelId, String from, String to) {
        Travel travel=travelService.getTravelById(travelId).get();
        List<Halt> haltList=routeService.getByRouteId(travel.getRouteID()) .get().getHaltArray();
        List<Halt>BookHaltList= HaltService.getAllHalts(from,to,haltList);
        List<Seat> AllBookedSeats=seatRepository.findByTravelId(travelId);
        List<Seat> actualBookedSeats=new ArrayList<>();
        for(Seat seat:AllBookedSeats){
            List<Halt> currentSeatHaltList=HaltService.getAllHalts(seat.getFrom(),seat.getTo(),haltList);
            for(Halt halt:BookHaltList){
                if(currentSeatHaltList.contains(halt.getName())){
                    actualBookedSeats.add(seat);
                    break;
                }
            }
        }

        return actualBookedSeats;
    }

    @Override
    public List<Seat> getAvailableSeatPerTravel(String travelId, String to, String from) {
        return null;
    }

    @Override
    public List<Seat> findByTravelId(String travelId) {
        return seatRepository.findByTravelId(travelId);
    }

    @Override
    public List<Seat> findBySmartCardId(String smartCardId) {
        return seatRepository.findBySmartCardId(smartCardId);
    }
}
