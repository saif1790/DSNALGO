package com.java8.feature.funtionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumerDemo  {


    public static void main(String[] args) {

        /*Consumer<Integer> consumer = integer -> System.out.println("Printing :" + integer);
        consumer.accept(10);*/
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().forEach(integer -> System.out.println("Printing :" + integer));
    }
}
