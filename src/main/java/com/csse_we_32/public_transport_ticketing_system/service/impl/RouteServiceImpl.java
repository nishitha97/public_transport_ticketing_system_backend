package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.Route;
import com.csse_we_32.public_transport_ticketing_system.repository.RouteRepository;
import com.csse_we_32.public_transport_ticketing_system.service.BusService;
import com.csse_we_32.public_transport_ticketing_system.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    RouteRepository routeRepository;
    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Optional<Route> getByRouteId(String routeId) {

        return routeRepository.findById(routeId);
    }

    @Override
    public Route save(Route route) {
        return routeRepository.save(route);
    }
}
