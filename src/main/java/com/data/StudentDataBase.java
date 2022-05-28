package com.data;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<List<Student>> studentSupplier=(()->getAllStudents());

    public static List<Student> getAllStudents(){

        /*
        * 2ngrade
        * */

        Student student1 = new Student("Adam",2,3.6d,"male",Arrays.asList("swimming","basketball","volyball"),11);
        Student student2 = new Student("Jenny",2,3.8d,"female",Arrays.asList("swimming","gymnastic","soccer"),10);

        Student student3 = new Student("Emily",3,4.0d,"male",Arrays.asList("swimming","gymnastic","arebics"),9);
        Student student4 = new Student("Dave",3,3.9d,"male",Arrays.asList("swimming","gymnastic","soccer"),8);

        Student student5 = new Student("Sophia",4,3.5d,"male",Arrays.asList("swimming","dancing","football"),8);
        Student student6 = new Student("James",4,3.9d,"male",Arrays.asList("swimming","basketball","baseball","volyball"),7);

                List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);

        return students;
    }
}
