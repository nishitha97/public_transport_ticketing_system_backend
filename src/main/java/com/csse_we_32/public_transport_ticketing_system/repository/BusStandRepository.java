package com.csse_we_32.public_transport_ticketing_system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse_we_32.public_transport_ticketing_system.domain.BusStand;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusStandRepository extends MongoRepository<BusStand,String>{

    Optional<BusStand> findByAddress(String s);
}
