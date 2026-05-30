package com.concurrent;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread implements Runnable{

  static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

  @Override
  public void run() {
    try{
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Child Thread uPDATING MAP :"+Thread.currentThread().getName());
    concurrentHashMap.put(3,"waseem");

  }

  public static void main(String[] args) throws InterruptedException {

    concurrentHashMap.put(1,"saif");
    concurrentHashMap.put(2,"sam");

    MyThread myThread = new MyThread();
    Thread thread = new Thread(myThread);
    thread.setName("CHILD THREAD");
    thread.start();

    Set  keySetView = concurrentHashMap.keySet();
    Iterator iterator = keySetView.iterator();
    while (iterator.hasNext())
    {
     Integer integer =(Integer) iterator.next();
      System.out.println("Main Thread Iterating map and current entry : "+ integer +"---"+concurrentHashMap.get(integer));
      Thread.sleep(3000);
    }
    System.out.println(concurrentHashMap);
  }
}
