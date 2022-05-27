package com.terminaloperations;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    //get sum of provided Numeric data
    static  int sum(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
    }
//get average of provided Numeric data
    static  Double avg(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingDouble(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        sum();
        avg();
    }
}
