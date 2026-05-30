package com.java8.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {

  public static void main(String[] args) {

    List<String> input = Arrays.asList("java","Spring","lambda","collections");
    System.out.println("Original List :"+ input);
    List<String> upperCase = input.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
    System.out.println("After convert to Uppercase :"+upperCase);
    List<String> lowercase = input.stream().map(String::toLowerCase).collect(Collectors.toList());
    System.out.println("After convert to Lowercase :"+ lowercase );
  }
}
