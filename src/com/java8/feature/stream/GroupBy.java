package com.java8.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

  public static void main(String[] args) {

    List<String> list = Arrays.asList("apple", "pear", "papaya", "grape", "kiwi");
    Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
    System.out.println(collect);


  }
}
