package com.optional;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    static String optionalOrElse(){
        Optional<Student> student= Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

        String name = student.map(Student::getName).orElse("Default");
        return name;
    }

    static String optionalOrElseGet(){
        Optional<Student> student= Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

        String name = student.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    static String optionalOrElseTrow(){
        Optional<Student> student= Optional.ofNullable(null);//Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

        String name = student.map(Student::getName).orElseThrow(()->new RuntimeException("No data available"));
        return name;
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseTrow());
    }
}
