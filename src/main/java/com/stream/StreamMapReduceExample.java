package com.stream;

import com.data.Student;
import com.data.StudentDataBase;

public class StreamMapReduceExample {

    static int countNoOfBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3)
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);

    }

    public static void main(String[] args) {
        int bookCount=countNoOfBooks();
        System.out.println(bookCount);
    }
}
