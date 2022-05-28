package com.optional;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class OptionalFlatMapExample {

    //filter
    static void optionalFilter(){

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

        optionalStudent.filter(student -> student.getGpa()>=4)
                .ifPresent(student -> System.out.print(student));
    }
//map
static void optionalMap(){

    Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

    optionalStudent.filter(student -> student.getGpa()>=4)
            .map(Student::getName);
}
    public static void main(String[] args) {

    }
}
