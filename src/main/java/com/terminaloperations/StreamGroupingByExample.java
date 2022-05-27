package com.terminaloperations;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }
    static void groupStudentByGpa(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student->Student.getGpa()>3.8?"OUTSTANDING":"AVERAGE"));
        System.out.println(studentMap);
    }

    static void twoLevelGrouping(){
      Map<Integer,Map<String,List<Student>>>studentMap=  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(Student->Student.getGpa()>3.8?"OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }
    static void twoLevelGrouping2(){
        Map<String,Integer>studentMap=  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student->Student.getNoteBooks())));
        System.out.println(studentMap);
    }
    static void threeLevelGrouping
        (){
        LinkedHashMap<String, Set<Student>>studentMap=  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        LinkedHashMap::new,Collectors.toSet()));
        System.out.println(studentMap);
    }

    static void calculateTopGpa(){
        Map<Integer,Optional<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMap);
    }
    public static void main(String[] args) {
     //groupStudentByGpa();
        calculateTopGpa();
    }
}
