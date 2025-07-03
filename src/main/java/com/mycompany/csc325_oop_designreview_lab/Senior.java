package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    // Constructor for Senior class with minimum credits
    public Senior(String name, int age, int credits) {
        super(name,age,credits);
        if (credits < 85) {
            throw new IllegalArgumentException("Credits must be greater than 85");
        }
    }
}
