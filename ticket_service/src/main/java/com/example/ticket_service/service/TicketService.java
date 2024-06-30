package com.example.ticket_service.service;

import com.example.ticket_service.dto.TicketDTO;

import java.util.List;

public interface TicketService {

    List<TicketDTO> getTickets();
    void addTicket(TicketDTO ticketDTO);
    void updateTicket(TicketDTO ticketDTO);
}
