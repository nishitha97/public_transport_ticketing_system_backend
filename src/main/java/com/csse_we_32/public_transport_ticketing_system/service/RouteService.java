package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Route;

import java.util.List;
import java.util.Optional;

public interface RouteService {
    List<Route> getAllRoutes();
    Optional<Route> getByRouteId(String routeId);
    Route save(Route route);
}
