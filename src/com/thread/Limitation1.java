package com.thread;

 class Task implements Runnable{
  @Override
  public void run() {
      // int sum =10;
    // return sum;
    System.out.println("Inside run");
  }
}

public class Limitation1{
  public static void main(String[] args) {

    Task task = new Task();
    Thread thread = new Thread(task);
    thread.start();

  }
}
