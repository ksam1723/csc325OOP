package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    // Constructor for Freshman
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }

    // toString method for freshman
    @Override
    public String toString() {
        return "Freshman: " + super.toString();
    }
}
