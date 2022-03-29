package com.example.please_compile_proschoolar;

import java.util.ArrayList;
import java.util.Calendar;

public class Student {
    String username;
    String password;
    ArrayList<Task> taskArray = new ArrayList<Task>();
    ArrayList<Task> taskArrayArchive = new ArrayList<Task>();

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

    public Student(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public ArrayList<Task> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(ArrayList<Task> taskArray) {
        this.taskArray = taskArray;
    }

    public void addTask(Task task){
        if(taskArray.size() == 0){
            taskArray.add(task);
            return;
        }

        for (int i = 0; i < taskArray.size(); i++) {
            if(taskArray.get(i).getDueDate().after(task.getDueDate())){
                taskArray.add(i, task);
                return;
            }

        }

        taskArray.add(task);
    }

    public void updateDueTasks(){

        if(taskArray.isEmpty()) return;

        for (Task task: taskArray) {
//May need time zone!!!!
            if(task.getDueDate().after(Calendar.getInstance())){
                taskArrayArchive.add(task);
                taskArray.remove(task);
            }
        }
    }
}