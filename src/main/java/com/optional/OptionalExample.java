package com.optional;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    static Optional<String> getName(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));

        if(student.isPresent()){
            Optional<String> name = student.map(Student::getName);
        return name;
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

    }
}
