package custom.sorting;

import java.time.LocalDateTime;

public class Flight {

  private String flightNumber;
  private String airline;
  private double price;
  private int duration; // total duration in minutes
  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;

  public Flight(String flightNumber, String airline, double price, int duration, LocalDateTime departureTime, LocalDateTime arrivalTime) {
    this.flightNumber = flightNumber;
    this.airline = airline;
    this.price = price;
    this.duration = duration;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(LocalDateTime departureTime) {
    this.departureTime = departureTime;
  }

  public LocalDateTime getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(LocalDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  @Override
  public String toString() {
    return "Flight{" + "flightNumber='" + flightNumber + '\'' + ", airline='" + airline + '\'' + ", price=" + price + ", duration=" + duration + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + '}';
  }
}
