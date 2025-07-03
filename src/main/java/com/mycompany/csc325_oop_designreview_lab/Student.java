/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
	private int credits;
    private double gpa;
    private String Address;

    // Constructor that takes name, age and credits
    public Student(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
    }

    // Setter for GPA
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Getter for GPA
    public double getGPA() {
        return gpa;
    }

    // Getter for Credits
    public int getCredits() {
        return credits;
    }

    // Abstract method from human
    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public void setAddress(String address) {
        this.Address = address;
    }

    @Override
    public String toString() {
        return "Student Name: " + getName() + ", Age: " + getAge() +
                ", Credits: " + credits + ", GPA: " + gpa;
    }
}
