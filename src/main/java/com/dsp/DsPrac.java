package com.dsp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DsPrac {


    public static void main(String[] args) {


        int[] arr = {1,19,6,9,7,2,3,4,5};
        int i,j,temp=0;
        for(i=0;i<arr.length-1;i++){

            for(j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+",");
        }
    }


}
