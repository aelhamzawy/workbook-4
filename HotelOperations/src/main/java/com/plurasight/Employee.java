package com.plurasight;

/// This is THe Employee Class To Get All The Information About THe Employee
public class Employee {

    /// Creating The Main Reservation Variables
    private String name;
    private int employeeId;
    private String department;
    private float payeRate;
    private float hoursWorked;
    private float totalPay;
    private float regularHours;
    private float overTimeHours;
    private double punchIn;
    private double punchOut;

    /// Creating The Constructor For The Reservation Class
    public Employee(String name, int employeeId, String department, float payeRate, float hoursWorked, float totalPay, float regularHours, float overTimeHours, double punchIn, double punchOut) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.payeRate = payeRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overTimeHours = overTimeHours;
        this.punchOut = punchOut;
        this.punchIn = punchIn;
    }


    ///===================================
            /// Getter Methods
    ///===================================

    /// Get The Employee Name
    public String getName() {
        return name;
    }

    /// Set The Employee Name
    public void setName(String name) {
        this.name = name;
    }

    /// Get The Employee id
    public int getEmployeeId() {
        return employeeId;
    }

    /// Set THe Employee id
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /// Get The Department
    public String getDepartment() {
        return department;
    }

    /// Set The Department
    public void setDepartment(String department) {
        this.department = department;
    }

    /// Get The Pay Rate
    public float getPayeRate() {
        return payeRate;
    }

    /// Get THe Number Of Hours Worked
    public float getHoursWorked() {
        return hoursWorked;
    }

    /// Set The Total Hours Worked
    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /// Get THe Total Payment
    public float getTotalPay() {
        return totalPay;
    }


    /// Get The Regular Number Of Hours
    public float getRegularHours() {
        return regularHours;
    }

    /// Get Over Time Hours
    public float getOverTimeHours() {
        return overTimeHours;
    }

    ///  Check if the employee is punch out or not
    public double isPunchOut() {
        return punchOut;
    }

    ///  set the punch out employee
    public void setPunchOut(double punchOut) {
        this.punchOut = punchOut;
    }

    ///  check if the employee is punched in or not
    public double isPunchIn() {
        return punchIn;
    }

    /// set the employee to punch in
    public void setPunchIn(double punchIn) {
        this.punchIn = punchIn;
    }
}
