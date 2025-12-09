package com.thread;

public class Seat {

    private boolean isBooked;
    private static int seatCount = 3;

    public synchronized boolean book(String username) throws InterruptedException {

        if(!isBooked)
        {
            isBooked = true;
            System.out.println("Seat is booked by "+ username);
            Thread.sleep(1000);
            return true;
        }
        else {
            System.out.println("Seat is already booked "+ username +"Failed to book");
            return false;
        }
    }

    public synchronized void bookSeat(String username) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" accuired Object Lock");
        if(seatCount > 0)
        {
            System.out.println("Seat is booked by "+ username);
            seatCount--;
            Thread.sleep(1000);
        }
        else {
            System.out.println("Seat is already booked "+ username +"Failed to book because seat count is"+ seatCount);
        }
    }
}
