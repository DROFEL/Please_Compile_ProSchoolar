package com.example.please_compile_proschoolar;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void sortTasksByDate(){
        Student student = new Student("A", "B");

        Calendar date1 = new Calendar.Builder().setDate(2002,1,1).build();
        Calendar date2 = new Calendar.Builder().setDate(2005,1,1).build();
        Calendar date3 = new Calendar.Builder().setDate(2000,1,1).build();
        Calendar date4 = new Calendar.Builder().setDate(2003,1,1).build();

        student.addTask(new Task("2002/01/01",date1));
        student.addTask(new Task("2005/01/01",date2));
        student.addTask(new Task("2000/01/01",date3));
        student.addTask(new Task("2003/01/01",date4));

        String output = "";
        for (Task task: student.getTaskArray()) {
            output += task.getName() + " ";
        }

        assertEquals("Task Sorting By date: ","2000/01/01 2002/01/01 2003/01/01 2005/01/01 ", output);
    }
}