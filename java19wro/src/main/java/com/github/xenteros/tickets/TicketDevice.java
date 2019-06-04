package com.github.xenteros.tickets;

import java.util.ArrayList;
import java.util.List;

class TicketDevice {

    private List<Ticket> tickets = new ArrayList<>();

    public Ticket createTicket() {
        Ticket ticket = new Ticket();
        tickets.add(ticket);
        return ticket;
    }


}
