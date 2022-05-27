package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class StreamFindExample {

    static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3).findAny();
    }
    static Optional<Student> finFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3).findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> findResult =  findAny();

        if(findResult.isPresent()){
            System.out.println(findResult.get());
        }

        Optional<Student> findFirstResult =  finFirst ();
        if(findFirstResult.isPresent()){
            System.out.println(findResult.get());
        }

    }
}
