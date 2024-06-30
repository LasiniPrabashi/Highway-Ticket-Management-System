package com.example.ticket_service.controller;

import com.example.ticket_service.dto.TicketDTO;
import com.example.ticket_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<TicketDTO> getTicketsDetails() {
        return ticketService.getTickets();
    }

    @PostMapping
    public void saveTicketDetails(@RequestBody TicketDTO ticketDTO) {
        ticketService.addTicket(ticketDTO);
    }

    @PatchMapping
    public void updateTicketDetails(@RequestBody TicketDTO ticketDTO) {
        ticketService.updateTicket(ticketDTO);
    }
}
