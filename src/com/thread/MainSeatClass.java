package com.thread;

public class MainSeatClass {
  public static void main(String[] args) {

    Seat seat = new Seat();
    Thread t1 = new Thread(new BookingTask(seat, "saif"));
    Thread t2 = new Thread(new BookingTask(seat, "sam"));
    Thread t3 = new Thread(new BookingTask(seat, "waseem"));

    t1.start();
    t2.start();
    t3.start();
  }
}
