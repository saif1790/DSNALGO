package custom.sorting;

import java.util.Comparator;

public class FlightSortByDuration implements Comparator<Flight> {
  @Override
  public int compare(Flight o1, Flight o2) {
    System.out.println("Inside compare method");
    if (o1.getDuration() > o2.getDuration()) {
      System.out.println(o1.getDuration() > o2.getDuration());
      return 1;
    } else if (o1.getDuration() < o2.getDuration()) {
      System.out.println(o1.getDuration() < o2.getDuration());
      return -1;
    } else {
      System.out.println(o1.getDuration() == o2.getDuration());
      return 0;
    }
  }
}
