package com.generic;

import com.java8.feature.stream.filter.Employee;

public class Main {

  public static void main(String[] args) {

    Container<String> container = new Container();
    container.setItem("Saif");
    container.setEmployee(new Employee("saif",1));
    System.out.println(container);

    Container<Integer> container1 = new Container();
    container1.setItem(234);
    System.out.println(container1.getItem());
  }
}
