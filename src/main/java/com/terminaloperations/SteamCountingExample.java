package com.terminaloperations;

import com.data.StudentDataBase;

import java.util.stream.Collectors;

public class SteamCountingExample {

    static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        count();
    }
}
