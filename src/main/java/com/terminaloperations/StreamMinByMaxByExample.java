package com.terminaloperations;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinByMaxByExample {
    //get minimum value object passed in comparator
    static Optional<Student> minBy(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(
                Student::getGpa
        )));

    }
    //get maximum value object passed in comparator
    static Optional<Student> maxBy(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(
                Student::getGpa
        )));
    }

    public static void main(String[] args) {
        minBy();
        maxBy();

    }
}

