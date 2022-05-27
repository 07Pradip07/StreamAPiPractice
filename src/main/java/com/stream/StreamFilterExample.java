package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {



    static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGradeLevel()>=2)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
