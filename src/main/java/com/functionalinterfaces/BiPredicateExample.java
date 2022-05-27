package com.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    static BiPredicate<Integer,Double> biPredicate = (grade,gpa)->grade>=3&&gpa>=4;
    public static void main(String[] args) {

        System.out.println(biPredicate.test(4,5d));

    }
}
