package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparator {

    static List<Student> sortedStudentList(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
    }
    static List<Student> sortedStudentListDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()) .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sortedStudentList().forEach(System.out::println);
    }
}
