package com.functionalinterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = (name)->name.toUpperCase();
    static Function<String,String> function1 = (name)->name.toUpperCase().concat("default");
    public static void main(String[] args) {

        System.out.println("Result is"+function.apply("java 8"));
        System.out.println(function.andThen(function1).apply("pradip"));
    }
}
