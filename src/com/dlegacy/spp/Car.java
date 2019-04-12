package com.dlegacy.spp;

public class Car {
    private String noImmatriculation;
    private String color;
    private int capacity;

    public Car(String noImmatriculation) {
        this.noImmatriculation = noImmatriculation;
        this.color = null;
        this.capacity = 0;
    }

    public Car(String noImmatriculation, int capacity) {
        this.noImmatriculation = noImmatriculation;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.noImmatriculation + " color " + this.color + " with capacity " + this.capacity + "\n";
    }
}
