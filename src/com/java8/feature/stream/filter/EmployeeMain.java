package com.java8.feature.stream.filter;

import java.util.ArrayList;

public class EmployeeMain {

  public static void main(String[] args) {


    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee("Saif", 23));
    list.add(new Employee("Monu", 34));
    list.add(new Employee("Asif", 45));
    list.add(new Employee("Kasif", 30));
    list.add(new Employee("Sher", 32));
    System.out.println(list);
   /* Predicate<Employee> p = employee -> employee.getAge() > 30;
    System.out.println("---"+p.test(new Employee("saif",40)));
    Comparator<Employee> comparator = (e1, e2) -> e1.age.compareTo(e2.age);
    Collections.sort(list, comparator);*/
    System.out.println(list);


  }
}
