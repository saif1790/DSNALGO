package com.thread.jmm;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedConuter {

  //AtomicInteger counter = new AtomicInteger(0);
  int counter = 0;

  /*public AtomicInteger getCounter() {
    return counter;
  }

  public void setCounter(AtomicInteger counter) {
    this.counter = counter;
  }*/

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}
