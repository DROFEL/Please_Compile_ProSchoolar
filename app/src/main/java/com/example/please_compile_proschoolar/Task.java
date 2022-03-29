package com.example.please_compile_proschoolar;

import java.util.Calendar;
import java.util.Date;

public class Task {
    String name;
    String courseName;
    double percentage;
    double gradeWeight;
    Calendar dueDate;

    public Task(){ }
    public Task(Calendar dueDate){
        this.dueDate = dueDate;
    }

    public Task(String name, Calendar dueDate){
            this.name = name;
            this.dueDate = dueDate;
    }

//  getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getGradeWeight() {
        return gradeWeight;
    }

    public void setGradeWeight(double gradeWeight) {
        this.gradeWeight = gradeWeight;
    }

    public void addGrade(double grade){

    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Calendar getDueDate() {
        return dueDate;
    }
}

