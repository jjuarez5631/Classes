package com.example.java;

public class Employee {
        //set variables for a general employee
    private String name;
    private int number;
    private int shift;
        //constructor
    public Employee(String name, int number, int shift) {
        this.name = name;
        this.number = number;
        this.shift = shift;
    }
        //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

        //display well formatted information.
    public void printAll() {
        System.out.println("Employee Number: " + number + "\nEmployee Name: " + name + "\nShift: " + shift);

    }
}

