package com.labda;

import java.util.Comparator;

public class ComparatorlambdaExample {

    public static void main(String[] args) {


        Comparator comaprator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of comparator"+comaprator.compare(2,1));

        Comparator<Integer> comparator1 = (Integer a,Integer b)-> a.compareTo(b);

        System.out.println("result "+ comparator1.compare(1,2));

        Comparator<Integer> com = (a,b)->a.compareTo(b);

        System.out.println("result labmda "+com.compare(2,1));

    }
}
