package com.java8.feature;

public class LambdaTest{

    public static void main(String[] args) {

        Runnable a = ()-> {
            for(int i=1;i<=10;i++)
            System.out.println(i);
        };

        Thread thread = new Thread(a);
        thread.run();
        FunctionalInterfaceTest b = ()-> "Hello G";

              //System.out.println(a.sum());
              System.out.println(b.sum());

    }



}
