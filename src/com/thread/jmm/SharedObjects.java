package com.thread.jmm;

public class SharedObjects {
  public static void main(String[] args) {

    MyObject myObject = new MyObject();
    Runnable runnable = new MyRunnable(myObject);

    Thread t1 = new Thread(runnable,"Thread-1");
    Thread t2 = new Thread(runnable,"Thread-2");
    //t1.setDaemon(true);
    System.out.println("Main"+Thread.currentThread().isDaemon());
    System.out.println("T1"+t1.isDaemon());
    t1.start();
    t2.start();

    for(int i=0;i<10;i++)
      System.out.println("hello"+i+1);
  }


}
