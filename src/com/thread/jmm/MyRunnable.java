package com.thread.jmm;

public class MyRunnable implements  Runnable{

   private int count = 0;
   private MyObject myObject = null;

   public MyRunnable(){

   }

   public MyRunnable(MyObject myObject){
     this.myObject = myObject;
   }


  @Override
  public void run() {

    System.out.println(myObject);

    for(int i=1; i <=10000; i++)
    {
      synchronized (this){
        this.count++;
      }

    }
    System.out.println(Thread.currentThread().getName() + " :"+ this.count);
  }
}
