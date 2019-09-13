package com.csse_we_32.public_transport_ticketing_system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse_we_32.public_transport_ticketing_system.domain.Travel;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends MongoRepository<Travel,String>{

}
