package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        for(String name:names){
            System.out.println("name");
        }
        for(String name:names){
            System.out.println("name");
        }
        //names.remove(0);
        //names.get(2);
        Stream<String> nameStream = names.stream();

        nameStream.forEach(System.out::println);
        nameStream.forEach(System.out::println);// not allowed

    }
}
