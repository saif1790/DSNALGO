package com.thread;

import java.util.concurrent.Semaphore;

public class PingPongDemo {

  public static void main(String[] args) {

    Semaphore pingSemaphore = new Semaphore(1);
    Semaphore pongSemaphore = new Semaphore(0);

    int MAX_LIMIT = 10;
    Thread thread1 = new Thread(()->{
      for(int i=1; i<=MAX_LIMIT; i++)
      {
        try {
          pingSemaphore.acquire();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("Ping +"+Thread.currentThread().getName());
        pongSemaphore.release();
      }
    });

    Thread thread2 = new Thread(()->{
      for(int i=1; i<=MAX_LIMIT; i++)
      {
        try {
          pongSemaphore.acquire();

        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("Pong +"+Thread.currentThread().getName());
        pingSemaphore.release();

      }
    });

    thread1.start();
    thread2.start();
  }
}
