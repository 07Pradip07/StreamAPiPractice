package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    static Predicate<Student> p1 =(s)->s.getGradeLevel()>=3;
    static Predicate<Student> p2 =(s)->s.getGpa()>=3.9;

    static BiConsumer<String, List<String>> studentBiConsumer = (name,activities)->{
        System.out.println(name+" : "+activities);
    };
    static Consumer<Student> studentConsumer = (student->{
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });
    static void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
    List<Student> students = StudentDataBase.getAllStudents();

    printNameAndActivities(students);
    }
}
