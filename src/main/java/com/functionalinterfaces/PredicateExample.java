package com.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
static Predicate<Integer> p = (i)->{return i%2==0;};
    static Predicate<Integer> p1 = (i)->{return i%2==0;};
    static Predicate<Integer> p2 = (i)->{return i%5==0;};

    static void predicateAnd(){
        System.out.println(p1.and(p2).test(10));
    }
    static void predicateOr(){
        System.out.println(p1.or(p2).test(5));
    }

    static void predicateNegate(){
        System.out.println("negate result test"+p1.and(p2).negate().test(3));
    }

    public static void main(String[] args) {


        Predicate<Integer> p = (i)->{return i%2==0;};

        System.out.println(p.test(4));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
