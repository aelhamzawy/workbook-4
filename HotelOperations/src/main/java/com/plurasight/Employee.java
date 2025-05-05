package com.plurasight;

// This is THe Employee Class To Get All The Information About THe Employee
public class Employee {

    // Creating The Main Reservation Variables
    private float totalPay;
    private float regularHours;
    private float overTimeHours;

    // Creating The Constructor For The Reservation Class

    public Employee(float overTimeHours, float regularHours, float totalPay) {
        this.overTimeHours = overTimeHours;
        this.regularHours = regularHours;
        this.totalPay = totalPay;
    }

    //===================================
    // Getter Methods
    //===================================


    // Get THe Total Payment
    public float getTotalPay() {
        return totalPay;
    }


    // Get The Regular Number Of Hours
    public float getRegularHours() {
        return regularHours;
    }

    // Get Over Time Hours
    public float getOverTimeHours() {
        return overTimeHours;
    }
}
