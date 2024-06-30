package com.example.ticket_service.service.impl;

import com.example.ticket_service.dto.TicketDTO;
import com.example.ticket_service.entity.Ticket;
import com.example.ticket_service.repo.TicketRepo;
import com.example.ticket_service.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceImpl  implements TicketService {

    @Autowired
    private TicketRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<TicketDTO> getTickets() {
        return repo.findAll().stream().map(ticket -> mapper.map(ticket, TicketDTO.class)).toList();
    }

    @Override
    public void addTicket(TicketDTO ticketDTO) {
        repo.save(mapper.map(ticketDTO, Ticket.class));
    }

    @Override
    public void updateTicket(TicketDTO ticketDTO) {
        repo.save(mapper.map(ticketDTO,Ticket.class));
    }
}
