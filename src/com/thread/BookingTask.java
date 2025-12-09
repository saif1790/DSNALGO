package com.thread;

public class BookingTask implements Runnable{

    private Seat seat;
    private String username;

    public BookingTask(Seat seat,  String username)
    {
        this.seat = seat;
        this.username = username;
    }

    @Override
    public void run() {
        try {
            //seat.book(username);
            seat.bookSeat(username);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
