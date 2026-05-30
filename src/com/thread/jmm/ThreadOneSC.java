package com.thread.jmm;

public class ThreadOneSC implements Runnable{

  private SharedConuter sharedConuter;

  public ThreadOneSC(SharedConuter sharedConuter) {
    this.sharedConuter = sharedConuter;
  }

  @Override
  public void run() {

    for(int i=1; i<=100_000; i++)
    {
      synchronized (sharedConuter){
        /*sharedConuter.counter.incrementAndGet();*/
        sharedConuter.counter++;//this 3 step process now combined in synchronized block and it has become atomic
      }

    }
  }
}
