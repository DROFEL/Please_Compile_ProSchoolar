package com.example.please_compile_proschoolar;

public class Student {
    String username;
    String password;
    Task[] tasks;


    public Task[] getTasks(){
        return this.tasks;
    }

    public void addTask(Task task){
        Task[] oldTasks = this.tasks;
        Task[] tempTaskArr = new Task[oldTasks.length];
        for (int i = 0; i < oldTasks.length; i++) {
            tempTaskArr[i] = oldTasks[i];
        }
        tempTaskArr[oldTasks.length] = task;
        this.tasks = tempTaskArr;
    }

    public void removeTask(Task task){
        Task[] taskArr = getTasks();
        for (int i = 0; i <taskArr.length; i++) {
            if (taskArr[i].getName().equals(task.getName())){
                //delete it
            }

        }
    }

}