package com.java8.feature.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(2, 3, 4, 6, 5, 88, 97);
    System.out.println("Original List :" + list);
    List<Integer> squareOfEvenNumber = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
    System.out.println("squareOfEvenNumber :" + squareOfEvenNumber);
    List<Integer> squareOfOddNumber = list.stream().filter(x -> x % 2 != 0).map(x -> x * x).collect(Collectors.toList());
    System.out.println("squareOfOddNumber :" + squareOfOddNumber);
  }
}
