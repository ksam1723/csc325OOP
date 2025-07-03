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

    // ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
