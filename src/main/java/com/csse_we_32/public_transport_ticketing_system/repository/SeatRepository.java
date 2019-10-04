package com.csse_we_32.public_transport_ticketing_system.repository;

import com.csse_we_32.public_transport_ticketing_system.domain.Seat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends MongoRepository<Seat, String> {
    List<Seat> findByTravelId(String travelId);
}
