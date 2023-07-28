package com.workintech.employeeApp.enums;

public enum Plan {
    INDIVIDUAL("1. Plan", 2000),
    GROUP("2. Plan", 3000),
    FAMILY("3. Plan", 5000);

    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Plan Name: " +  getName() + " Price: " + getPrice();
    }
}
