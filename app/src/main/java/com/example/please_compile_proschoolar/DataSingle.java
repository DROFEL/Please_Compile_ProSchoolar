package com.example.please_compile_proschoolar;

public class DataSingle {
    private static DataSingle instance;

    //singleton implementation start
    private DataSingle(){}

    public static DataSingle getInstance() {
        if(instance == null)
            instance = new DataSingle();

        return instance;
    }


    //variables
    Student sessionStudent;

    //getters/setters
    public void setSessionStudent(Student sessionStudent) {
        this.sessionStudent = sessionStudent;
    }
    public Student getSessionStudent() {
        return sessionStudent;
    }
}
