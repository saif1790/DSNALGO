package com.java8.feature.funtionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionMain {

  public static void main(String[] args) {
    /*FunctionDemo functionalDemo = ( x,y) -> x*y;
    System.out.println(functionalDemo.m1(4,5));
    List<String> names = Arrays.asList("John", "Alice", "Bob");
*/

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(45);
    arrayList.add(5);
    arrayList.add(10);
    arrayList.add(11);
    Comparator<Integer> comparator = (i1,i2)-> (i1<i2)?-1:((i1>i2)?1:0);
    Collections.sort(arrayList,comparator);
    System.out.println(arrayList);
    Runnable thread1 = () -> {
      for (int i = 1; i <= 10; i++) {
        System.out.println("Child Thread");
      }
    };
    Thread thread = new Thread(thread1);
    thread.start();
    for (int i = 1; i <= 10; i++) {
      System.out.println("Main Thread");
    }
  }
}
