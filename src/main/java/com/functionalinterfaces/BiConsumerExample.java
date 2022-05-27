package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    static void nameAndActivities(){

        BiConsumer<String,List<String>> biconsumer = (name,activities)->{
            System.out.println("name is"+name+"and its activities"+activities);
        };
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> biconsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b)->{
            System.out.println(a+b);
        };

        biConsumer.accept("name","pradip");

        BiConsumer<Integer,Integer> multipy = (x,y)->{
            System.out.println(x*y);
        };

        multipy.accept(1,2);

        nameAndActivities();

    }
}
