package com.example.please_compile_proschoolar;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Loader {

    public static void addStudent(Student student){

        ArrayList<Student> studentArray = new ArrayList<>();

        Gson gson = new Gson();

        String JSON ;

    }

    public static Student loadStudent(String name){


        return new Student(name, name);
    }
}
