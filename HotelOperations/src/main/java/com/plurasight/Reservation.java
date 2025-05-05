package com.plurasight;

// This Is The Reservation Class
// This Class To Check The Room Type And The Number Of Nights
public class Reservation {
    // Reservation Main Variables
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private float reservationTotal;

    // Reservation Constructor To Re-assign The Values To The Variables
    public Reservation(String roomType, float reservationTotal, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.reservationTotal = reservationTotal;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    //================================
    // Getter And Setter Methods
    //=================================

    // Get The Room Type King Or Double
    public String getRoomType() {
        return roomType;
    }

    // Set The Room Type
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Get The Number Of Nights
    public int getNumberOfNights() {
        return numberOfNights;
    }

    // Set The Number Of Nights
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // To Check If Its is Weekend OR nOT
    public boolean isWeekend() {
        return isWeekend;
    }

    // Set The Weekend Values
    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // Get The Reservation Total
    public float getReservationTotal() {
        return reservationTotal;
    }


}
