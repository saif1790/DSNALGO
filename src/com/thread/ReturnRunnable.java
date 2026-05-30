package com.thread;

public class ReturnRunnable implements Runnable{
  MyCallable myCallable;
  private int results;

  public ReturnRunnable(MyCallable myCallable) {
    this.myCallable = myCallable;
  }

  @Override
  public void run() {
    try {
      System.out.println("Run method execute by "+Thread.currentThread().getName());
      this.results = myCallable.compute();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public int getResults(){
    return results;
  }
}
