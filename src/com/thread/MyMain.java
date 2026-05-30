package com.thread;

public class MyMain {
  public static void main(String[] args) throws InterruptedException {

    MyCallable myCallable = new MyCallable() {
      @Override
      public int compute() throws Exception {
        return 10;
      }
    };
    ReturnRunnable runnable = new ReturnRunnable(myCallable);
    Thread thread = new Thread(runnable);
    thread.start();
    thread.join();

    System.out.println("This line executed by"+Thread.currentThread().getName()+" "+runnable.getResults());
  }
}
