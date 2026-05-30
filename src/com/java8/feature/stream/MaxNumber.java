package com.java8.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {

  public static void main(String[] args) {

    List<Integer> input = Arrays.asList(23,59,5,88,93);
    Optional<Integer> max = input.stream().max(Integer::compareTo);
    System.out.println("Max Number :"+max);
  }
}
