package com.csse_we_32.public_transport_ticketing_system.repository;

import com.csse_we_32.public_transport_ticketing_system.domain.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {
}
