package com.stream;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {


    public static void main(String[] args) {
        Stream<String> names = Stream.of("adam","dam","julie");

        //ieterate

      //  Stream.iterate(1,x->x*2).        limit(10)         .forEach(System.out::println);
//generate
        Supplier<Integer> supplier = new Random()::nextInt;

        Stream.generate(supplier).limit(10).forEach(System.out::println);
    }
}
