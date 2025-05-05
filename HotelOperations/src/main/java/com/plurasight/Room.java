package com.plurasight;
//// This is The Room Class
//// It describes How Each Room Should be Shapped And Looked Like
public class Room {

    //// Room Main Variables
    private int numberOfBeds;
    private float price;
    private boolean isOccupied;
    private boolean isAvailable;
    private boolean isDirty;
    private int roomId;
    private boolean checkIn;
    private boolean checkOut;

    //// Room Constructor To Re-assign The Values To The Room Variables
    public Room(int numberOfBeds, boolean isAvailable, boolean isOccupied, float price, int roomId, boolean isDirty, boolean checkIn, boolean checkOut) {
        this.numberOfBeds = numberOfBeds;
        this.isAvailable = isAvailable;
        this.isOccupied = isOccupied;
        this.price = price;
        this.roomId = roomId;
        this.isDirty = isDirty;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //// Getter Methods For The Variables

    //// Get Number Of Bes In Each Room
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    //// To Check If THe Room Is Available Or Not
    public boolean isAvailable() {
        return isAvailable;
    }

    //// To Get The Room Price
    public float getPrice() {
        return price;
    }

    // To Check If The Room Is Occupies Or Not
    public boolean isOccupied() {
        return isOccupied;
    }

    //// Get Room id
    public int roomId(int roomId){
        return roomId;
    }

    //// Get If THe Room Is Dirty Or Not
    public boolean isDirty() {
        return isDirty;
    }

    //// Set The Room Is Dirty Or Not
    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    //// Check If THe Room Is Checked Out Or Not
    public boolean isCheckOut() {
        return checkOut;
    }

    //// Set The Check In Room
    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    //// Check If THe Room Is Checked In Or Not
    public boolean isCheckIn() {
        return checkIn;
    }

    //// Set The Check In Room
    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }
}
