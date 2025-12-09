package com.thread;

public class ThreadUsingLambda {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Runnable task = () -> {
            System.out.println("Thread "+ Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Completeds");
        };
        Thread thread1 = new Thread(task,"hello");
        thread1.start();
    }
}
