package com.example.please_compile_proschoolar;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Loader {

    SharedPreferences sharedPref;
    Gson gson;

    public Loader(){
        Context context = MainActivity.instance;
        sharedPref = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        gson = new Gson();
    }
    public void addStudent(Student student){

        ArrayList<Student> studentArray = new ArrayList<Student>();

        String fromJSON = sharedPref.getString("students", null);

        if(fromJSON != null && fromJSON != ""){
            studentArray = gson.fromJson(fromJSON, new ArrayList<Student>(){}.getClass());
        }

        studentArray.add(student);

        String toJSON = gson.toJson(studentArray);
        sharedPref.edit().putString("students", toJSON);
        sharedPref.edit().apply();


    }

    public static ArrayList<Student> Test(ArrayList<Student> students){
        Gson gson = new Gson();

        String JSON = gson.toJson(students);
        return gson.fromJson(JSON, new ArrayList<Student>(){}.getClass());

    }

    public Student loadStudent(String name){

        ArrayList<Student> studentArray = new ArrayList<Student>();

        String fromJSON = sharedPref.getString("students", null);

        if(fromJSON == null && fromJSON == ""){ return null; }

        studentArray = gson.fromJson(fromJSON, new ArrayList<Student>(){}.getClass());

        for (Student student: studentArray) {
            if(student.getUsername() == name)
                return student;
        }

        return null;
    }
}
