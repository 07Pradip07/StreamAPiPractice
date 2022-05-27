package com.stream;

import com.data.StudentDataBase;

public class StreamsMatchExample {

    static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa()>=3.9);
    }
    static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa()>=3.9);
    }
    static boolean noMatch(){
        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa()>=5.0);
    }
    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
        System.out.println(noMatch());
    }
}
