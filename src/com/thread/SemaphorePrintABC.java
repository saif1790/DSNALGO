package com.thread;

import java.util.concurrent.Semaphore;

public class SemaphorePrintABC {

  public static void main(String[] args) {
    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(0);
    Semaphore semaphore3 = new Semaphore(0);

    int MAX_LIMIT = 3;
    Thread thread1 = new Thread(()->{
      for(int i=1; i<=MAX_LIMIT; i++)
      {
        try {
          semaphore1.acquire();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("A +"+Thread.currentThread().getName());
        semaphore2.release();
      }
    });

    Thread thread2 = new Thread(()->{
      for(int i=1; i<=MAX_LIMIT; i++)
      {
        try {
          semaphore2.acquire();

        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("B +"+Thread.currentThread().getName());
        semaphore3.release();

      }
    });

    Thread thread3 = new Thread(()->{
      for(int i=1; i<=MAX_LIMIT; i++)
      {
        try {
          semaphore3.acquire();

        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("C +"+Thread.currentThread().getName());
        semaphore1.release();

      }
    });

    thread1.start();
    thread2.start();
    thread3.start();
  }
  }
