package com.example;

public class Course {
    private String CourseName;
    //default constructor
    public Course(String CourseName)
    {
        this.CourseName = CourseName;
    }

    //default Setters and Getters

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    public String getName() {
        return CourseName;
    }

}

