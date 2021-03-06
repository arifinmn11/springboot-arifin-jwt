package com.arifinmn.projectapi.services.impl;

import com.arifinmn.projectapi.entities.Tickets;
import com.arifinmn.projectapi.repositories.TicketRepository;
import com.arifinmn.projectapi.services.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl extends CommonServiceImpl<Tickets, Integer> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }
}