package com.java8.feature.funtionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {
    /*@Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0)
            return true;
        else
        return false;
    }*/

    public static void main(String[] args) {
        /*PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.test(5));*/
        Predicate<Integer> predicate =  integer -> integer % 2 == 0;
        System.out.println(predicate.test(20));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(integer -> integer % 2 == 0).forEach(integer -> System.out.println("Printing Even :" + integer));


    }
}
