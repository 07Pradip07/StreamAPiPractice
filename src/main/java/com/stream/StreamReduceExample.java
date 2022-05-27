package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    static int performMultiplication(List<Integer> integers){
        return integers.stream().reduce(1,(a,b)->a*b);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);


    }
}
