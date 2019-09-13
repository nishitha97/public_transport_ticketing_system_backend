package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();
}
