package com.example.please_compile_proschoolar;

import java.util.ArrayList;
public class Student {
    String username;
    String password;

    ArrayList<Task> taskArary  = new ArrayList<Task>();

    public Student(String name, String password) {
    }

    public ArrayList<Task> getTaskArary() {
        return taskArary;
    }

    public void setTaskArary(ArrayList<Task> taskArary) {
        this.taskArary = taskArary;
    }
}