package com.thread;

public class InterThreadCommunication1 {

  public static void main(String[] args) throws InterruptedException {

    ThreadDemo threadDemo = new ThreadDemo();
    threadDemo.start();
    //If we are expecting some expectation calling sleep() Join() is not recommended because
    // it increase the waiting time of main thread
    //Thread.sleep(2000);
    //threadDemo.join();
    //Recommended method is wait(),notify() and notifyAll()
    synchronized (threadDemo){
      System.out.println("Main thread trying to call wait()");
      threadDemo.wait();
      System.out.println("Main Thread got notification");
      System.out.println(threadDemo.total);
    }
  }
}

class ThreadDemo extends Thread
{
  int total = 0;
  public void run(){

    synchronized (this){
      System.out.println("Child Thread started calculation");
      for(int i = 0; i <= 100; i ++)
      {
        total = total + i;
      }
      System.out.println("Child Thread giving Notification");
      this.notify();
    }
  }
}
