package com.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
  public static void main(String[] args) {

    ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
    concurrentHashMap.put(1,"saif");
    concurrentHashMap.put(2,"sam");
    System.out.println(concurrentHashMap);
    concurrentHashMap.putIfAbsent(1,"waseem");
    concurrentHashMap.putIfAbsent(3,"waseem");
    //concurrentHashMap.remove(1);
    /*concurrentHashMap.remove(1,"sam");
    concurrentHashMap.remove(1,"saif");*/

    concurrentHashMap.replace(1,"saif","papa");
    System.out.println(concurrentHashMap);

  }
}
