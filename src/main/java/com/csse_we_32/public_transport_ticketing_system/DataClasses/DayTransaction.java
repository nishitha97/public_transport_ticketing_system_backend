package com.csse_we_32.public_transport_ticketing_system.DataClasses;

public class DayTransaction {
    private String day;
    private double amount;

    public DayTransaction(String day, double amount) {
        this.day = day;
        this.amount = amount;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
