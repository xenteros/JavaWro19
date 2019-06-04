package com.github.xenteros.tickets;

import java.util.Timer;

class Application {

    public static void main(String[] args) {

        TicketDevice ticketDevice = new TicketDevice();
        Desk desk1 = new Desk(ticketDevice, "desk1");
        Desk desk2 = new Desk(ticketDevice, "desk2");
        Timer timer = new Timer();
        timer.schedule(desk1, 0, 5000);
        timer.schedule(desk2, 0, 7500);

        Ticket ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();
        ticket = ticketDevice.createTicket();



    }
}
