package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream().limit(2).reduce((x,y)->x+y);
    }
    static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream().skip(8).reduce((x,y)->x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,4,5,6,7,8,9,11);

        Optional<Integer> limitResult = limit(integerList);
        if(limitResult.isPresent()){
            System.out.println(limitResult.get());
        }else {
            System.out.println("not input found");
        }

        Optional<Integer> skipResult = skip(integerList);
        if(skipResult.isPresent()){
            System.out.println(skipResult.get());
        }else {
            System.out.println("not input found");
        }
    }
}
