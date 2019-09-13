package com.csse_we_32.public_transport_ticketing_system.repository;

import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepository extends MongoRepository<TimeSlot, String> {
}
