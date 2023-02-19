package com.example.thirdhomework;

public class OldTicket extends Ticket {

    private float ticketDiscount;

    public OldTicket(float ticketPrice, int numberOfTickets) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public OldTicket(float price, String departureDate, String arrivalDate, int distance, String departurePoint, String arrivalPoint, String travelTime, int numberOfTickets) {
        super(price, departureDate, arrivalDate, distance, departurePoint, arrivalPoint, travelTime, numberOfTickets);
    }
    public float countTicketPrice() {
        return (getPrice() * getNumberOfTickets() * (100 - ticketDiscount)) / 100;
    }
}
