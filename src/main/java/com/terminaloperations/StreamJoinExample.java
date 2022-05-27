package com.terminaloperations;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoinExample {

    static String joining1(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
    }

    static String joining2(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("_"));
    }
    static String joining3(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("_","(",")"));
    }

    public static void main(String[] args) {
        joining1();
        joining2();
        joining3();
    }

}
