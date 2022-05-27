package com.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    static int sumOfNNumbers(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y)->x+y);
    }

    static int sumOfNNumbersIntStream(){
       return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,6,8,90,1,2,3,456);

        System.out.println("sum of interger is"+sumOfNNumbers(integerList));

        System.out.println("sum of interger using IntStream is"+sumOfNNumbersIntStream());

    }
}
