package com.thread;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

  public static void main(String[] args) {

    // Create ExecutorService with 2 threads
    ExecutorService executor = Executors.newFixedThreadPool(10);

    // Submit 5 tasks
    try (FileWriter writer = new FileWriter("output.txt", true)) {
      writer.write("Hello from ExecutorService thread!\n");
      System.out.println("Written by: " + Thread.currentThread().getName());
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Shutdown executor
    executor.shutdown();
  }
}
