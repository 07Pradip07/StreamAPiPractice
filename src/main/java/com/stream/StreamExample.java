package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    static Consumer<Student> studConsumer = (student -> {
        System.out.println(student);
    });

    static Predicate<Student> gradPredicate = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> gpaPredicate = (student -> student.getGpa()>=4);

    public static void main(String[] args) {

        List<Student> students  = StudentDataBase.getAllStudents();


        List<Student>modifyList=students.stream()
                .filter(gpaPredicate)
                .filter(gradPredicate)
                .collect(Collectors.toList());

        modifyList.forEach(studConsumer);

    }
}
