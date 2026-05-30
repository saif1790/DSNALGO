package com.thread.jmm;

public class MainSC {

  public static void main(String[] args) throws InterruptedException {

    SharedConuter sharedConuter = new SharedConuter();
    Thread t1 = new Thread(new ThreadOneSC(sharedConuter));
    Thread t2 = new Thread(new ThreadOneSC(sharedConuter));
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(sharedConuter.getCounter());

  }
}
