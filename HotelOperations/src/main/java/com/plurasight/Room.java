package com.plurasight;
// This is The Room Class
// It describes How Each Room Should be Shapped And Looked Like
public class Room {

    // Room Main Variables
    private int numberOfBeds;
    private float price;
    private boolean isOccupied;
    private boolean isAvailable;

    // Room Constructor To Re-assign The Values To The Room Variables
    public Room(int numberOfBeds, boolean isAvailable, boolean isOccupied, float price) {
        this.numberOfBeds = numberOfBeds;
        this.isAvailable = isAvailable;
        this.isOccupied = isOccupied;
        this.price = price;
    }

    // Getter Methods For The Variables

    // Get Number Of Bes In Each Room
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // To Check If THe Room Is Available Or Not
    public boolean isAvailable() {
        return isAvailable;
    }

    // To Get THe Room Price
    public float getPrice() {
        return price;
    }

    // To Check If The Room Is Occupies Or Not
    public boolean isOccupied() {
        return isOccupied;
    }
}
