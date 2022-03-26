package com.example.please_compile_proschoolar;

import java.util.ArrayList;
public class Student {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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