package com.thread;

public class Limitation2 {

  public static void main(String[] args) {

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        throw  new RuntimeException("Something went wrong");
      }
    };

    Thread thread = new Thread(runnable);
    try {
      thread.start();
    }
    catch (Exception e){
      System.out.println("Exception Thrown");
    }
  }
}
