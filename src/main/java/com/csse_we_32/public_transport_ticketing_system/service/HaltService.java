package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Halt;
import com.csse_we_32.public_transport_ticketing_system.domain.Route;

import java.util.ArrayList;
import java.util.List;

public interface HaltService {
    List<Halt> getAllHalts();
    static List<Halt> getAllHalts( String from, String to, List<Halt> haltList) {
        List<Halt>fromToHaltList=new ArrayList<>();
        Boolean haltBegin=false;
        for(Halt halt:haltList){
            if(halt.getName().equals(from))
                haltBegin=true;
            if(haltBegin==true){
                fromToHaltList.add(halt);
            }
            if(halt.getName().equals(to)){
                break;
            }
        }

        return fromToHaltList;
    }

    static double getPrice(String from, String to, Route route) {
        double fromKm=0;
        double toKm=0;
        for(Halt halt:route.getHaltArray()){
            if(halt.getName().equals(from)){
                fromKm=halt.getKmFromBustand1();
            }
            if(halt.getName().equals(from)){
                toKm=halt.getKmFromBustand1();
            }
        }

        return (toKm-fromKm)*route.getCostPerKm();
    }

}
