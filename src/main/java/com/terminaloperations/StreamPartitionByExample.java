package com.terminaloperations;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPartitionByExample {

    static void partitonBy(){
       Map<Boolean, List<Student>> partionMap=StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(student ->student.getGpa()>=3.9));

        System.out.println(partionMap);
    }
    static void partitonBy2(){
        Map<Boolean, Set<Student>> partionMap=StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy((student ->student.getGpa()>=3.9),Collectors.toSet()));

        System.out.println(partionMap);
    }
    public static void main(String[] args) {

    }
}
