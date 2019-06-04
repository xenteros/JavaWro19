package com.github.xenteros.tickets;

import java.time.LocalDateTime;

class Ticket {

    private static int nextNumber = 1;

    private int number;
    private LocalDateTime createdAt;
    private String window;
    private LocalDateTime calledAt;

    public Ticket() {
        this.number = nextNumber++;
        this.createdAt = LocalDateTime.now();
    }

    public static void resetNextNumber() {
        nextNumber = 1;
    }

    public void setWindow(String window) {
        this.window = window;
        this.calledAt = LocalDateTime.now();
    }

    public boolean wasCalled() {
        return window != null;
    }

    public int getNumber() {
        return number;
    }



    @Override
    public String toString() {
        return String.format("Ticket number %d, created at: %s", number, createdAt.toString());
    }
}
