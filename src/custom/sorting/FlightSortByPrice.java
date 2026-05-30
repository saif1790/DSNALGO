package custom.sorting;

import java.util.Comparator;

public class FlightSortByPrice implements Comparator<Flight> {
  @Override
  public int compare(Flight o1, Flight o2) {
    if (o1.getPrice() > o2.getPrice()) return 1;
    else if (o1.getPrice() < o2.getPrice()) {
      return -1;
    }
    return 0;
  }
}
