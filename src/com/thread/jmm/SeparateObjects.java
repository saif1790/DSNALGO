package com.thread.jmm;

public class SeparateObjects {

  public static void main(String[] args) {

    MyObject myObject = new MyObject();
    MyRunnable runnable1 = new MyRunnable(myObject);
    MyRunnable runnable2 = new MyRunnable(myObject);

    Thread t1 = new Thread(runnable1,"Thread-1");
    Thread t2 = new Thread(runnable2,"Thread-2");

    t1.start();
    t2.start();

  }
}
