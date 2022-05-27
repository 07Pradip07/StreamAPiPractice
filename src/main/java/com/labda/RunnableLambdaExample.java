package com.labda;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Runnable  r= new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable start");
            }
        } ;

        new Thread(r).start();

        Runnable runnabblelambda = () ->{
            System.out.println("labda thread");
        };

        new Thread(runnabblelambda).start();

        Runnable runnableLambda1 = ()-> System.out.println("labda 1");

        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("new way")).start();



    }
}
