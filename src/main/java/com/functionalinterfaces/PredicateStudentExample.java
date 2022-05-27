package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student)->student.getGradeLevel()>=3;
    static Predicate<Student> p2 = (student)->student.getGpa()>=4;
    static void filterStudentByGrateLevel(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }
    static void filterStudentByGPALevel(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    static void  filterStudents(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println(student);
            }
        });

    }

    public static void main(String[] args) {
        //filterStudentByGrateLevel();
        //filterStudentByGPALevel();
        filterStudents();
    }
}
