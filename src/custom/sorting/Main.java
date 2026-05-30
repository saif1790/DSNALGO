package custom.sorting;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Flight> flightList = new ArrayList<>();
    flightList.add(new Flight("6E:205", "Indigo", 5000.00,
            120, LocalDateTime.of(2026, 1, 10, 14, 30),
            LocalDateTime.of(2026, 1, 10, 16, 30)));
    flightList.add(new Flight("SG:206", "Spicejet", 5500.00,
            30, LocalDateTime.of(2026, 1, 10, 13, 30),
            LocalDateTime.of(2026, 1, 10, 14, 00)));
    flightList.add(new Flight("SG:207", "Spicejet", 4500.00,
            60, LocalDateTime.of(2026, 1, 10, 15, 30),
            LocalDateTime.of(2026, 1, 10, 16, 30)));
    flightList.add(new Flight("SG:207", "Spicejet", 4500.00,
            60, LocalDateTime.of(2026, 1, 10, 15, 30),
            LocalDateTime.of(2026, 1, 10, 16, 30)));

    System.out.println("Before Sorting :"+flightList);
    Collections.sort(flightList,new FlightSortByPrice());
    System.out.println("After Sorting Based on Prices :"+flightList);
    Collections.sort(flightList,new FlightSortByDepartureTime());
    System.out.println("After Sorting Based on Departure Time :"+flightList);
    Collections.sort(flightList,new FlightSortByDuration());
    System.out.println("After Sorting Based on Departure Time :"+flightList);

    flightList.stream().sorted(new FlightSortByDuration());


  }
}
