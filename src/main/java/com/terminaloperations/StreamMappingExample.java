package com.terminaloperations;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMappingExample {

    public static void main(String[] args) {

        List<String> names = StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName,Collectors.toList()));
        Set<String> names1 = StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName,Collectors.toSet()));
    }
}
