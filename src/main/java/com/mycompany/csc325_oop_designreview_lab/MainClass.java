/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 Scanner scnr = new Scanner(System.in);

	 // Changed Student to Freshman
	 Freshman std1= new Freshman("James", 20, 12); // name, age, credits
	 // Changed Student to Senior
	 Senior std2 = new Senior("John", 30, 90);

	 // Set GPA for std1
	 System.out.println("Enter GPA for " + std1.getName() + ": ");
	 double gpa = scnr.nextDouble();
	 std1.setGPA(gpa);

	 // Set GPA for std2
	 System.out.println("Enter GPA for " + std2.getName() + ": ");
	 double gpa2 = scnr.nextDouble();
	 std2.setGPA(gpa2);

	 // Print student information
	 System.out.println(std1);
	 System.out.println(std2);

	 scnr.close();

	}
}

