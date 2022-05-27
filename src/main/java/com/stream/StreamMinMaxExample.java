package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    static int maxValue(List<Integer> integerList){

        return integerList.stream().reduce(0,(x,y)->x>y?x:y);
    }

    static Optional<Integer> maxValueOptional(List<Integer> integerList){

        return integerList.stream().reduce((x,y)->x>y?x:y);
    }

    //min value

    static Optional<Integer> finfMinValue(List<Integer> integerList)
    {
        return integerList.stream().reduce((x,y)->x<y?x:y);
    }
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,5,7,10,14);
        int maxValue = maxValue(integerList);
        System.out.println(maxValue);

        Optional<Integer> maxOptional = maxValueOptional(integerList);
        if(maxOptional.isPresent()){
            System.out.println(maxOptional.get());
        }else{
            System.out.println("value not present");
        }

        Optional<Integer> minvalue = finfMinValue(integerList);
        if(minvalue.isPresent()){
            System.out.println(minvalue.get());
        }else{
            System.out.println("value not present");
        }
    }
}
