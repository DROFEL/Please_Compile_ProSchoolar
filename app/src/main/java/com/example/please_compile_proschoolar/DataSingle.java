package com.example.please_compile_proschoolar;

public class DataSingle {
    private static DataSingle instance;
    private Loader loader;


    //singleton implementation start
    private DataSingle(){
        loader = new Loader();
    }

    public static DataSingle getInstance() {
        if(instance == null)
            instance = new DataSingle();



        return instance;
    }


    //variables
    Student sessionStudent;
    String dsTest = ("she don't like you back bro"); //you are too nice guy

    //use these 2 methods to add a new student(1 one) or get existing one(2nd one)
    public void setSessionStudent(Student sessionStudent) {
        this.sessionStudent = sessionStudent;
        loader.addStudent(sessionStudent);
    }

    public void setSessionStudent(String name){
        sessionStudent = loader.loadStudent(name);
    }

    public Student getSessionStudent() {
        return sessionStudent;
    }
}
