package com.github.xenteros.tickets;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

class Desk extends TimerTask {

    private TicketDevice ticketDevice;
    private String name;

    public Desk(TicketDevice ticketDevice, String name) {
        this.ticketDevice = ticketDevice;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " calling a ticket device for a new person");
        ticketDevice.getTicketForADesk(name);
    }
}
