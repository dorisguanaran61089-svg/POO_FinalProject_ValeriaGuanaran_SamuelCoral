package domain;

import java.io.Serializable;

//Represents a ticket purchased by a customer for a specific event.

public class Ticket implements Serializable {

    // Ensures serialization compatibility.

    private static final long serialVersionUID = 1L;

    // ATTRIBUTES

    private int id; // Ticket
    private Event event; // Related event
    private Customer customer;// Customer who purchased
    private double price; // Base price
    private double finalPrice; // Final price with discounts
    private String seatNumber; // Seat number

    // CONSTRUCTOR

    //Creates a ticket and automatically calculates the final price.

    public Ticket(int id, Event event, Customer customer, double price, String seatNumber) {
        this.id = id;
        this.event = event;
        this.customer = customer;
        this.price = price;
        this.finalPrice = calculateFinalPrice(); // Calculate discounted final price
        this.seatNumber = seatNumber;
    }

    // BUSINESS LOGIC

    // Prints the ticket information to console.

    public void printTicket() {
        System.out.println("TICKET");
        System.out.println("ID: " + id);
        System.out.println("Event: " + event.getName());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Seat: " + seatNumber);
        System.out.println("Final Price: $" + finalPrice);
    }

    // Calculates the final price applying VIP discounts.

    private double calculateFinalPrice() {

        double normalPrice = this.price;
        double total = normalPrice;

        // Check if customer is VIP

        if (customer instanceof VipCustomer vip) {

            double discount = vip.getDiscount();
            String level = vip.getVipLevel().toUpperCase();

            // Base VIP discount
            total = normalPrice - (normalPrice * discount);

            // Additional discounts based on VIP level

            switch (level) {
                case "GOLD" -> total -= normalPrice * 0.05;
                case "PLATINUM" -> total -= normalPrice * 0.10;
                case "DIAMOND" -> total -= normalPrice * 0.15;
            }
        }

        return total;
    }

    // GETTERS

    public int getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getPrice() {
        return price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getFinalPrice() {
        return finalPrice;
    }
}
