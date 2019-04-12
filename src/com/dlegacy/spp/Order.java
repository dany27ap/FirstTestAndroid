package com.dlegacy.spp;

public class Order {
    private int quantity;
    private String destination;

    public Order() {
        this.quantity = 0;
        this.destination = null;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Quantity " + this.quantity + " destination: " +  this.destination;
    }
}
