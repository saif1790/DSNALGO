package com.java8.feature.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/*Filter name which length > 3*/
public class FilterDemo {

  public static void main(String[] args) {

    List<String> namesList = Arrays.asList("saif", "bob", "sam", "waseem", "azhar");
    List<Integer> numberList = Arrays.asList(1, 2, 4, 5, 6);
    List<String> filteredNames = namesList.stream().filter(name -> name.length() > 3).collect(Collectors.toList());
    System.out.println(filteredNames);
    String[] s = {"saif", "bob", "sam", "waseem", "azhar"};
    Predicate<String> predicate = s1 -> s1.length() > 5;
    for (String s2 : s) {
      if (predicate.test(s2))
        System.out.println(s2);
    }
    List<Employee> list = new ArrayList<Employee>();
    list.add(new Employee("saif", 60));
    list.add(new Employee("sam", 35));
    list.add(new Employee("waseem", 30));
    list.add(new Employee("azhar", 35));
    list.add(new Employee("monu", 26));
    Function<Employee, String> function = i -> {

      if (i.getMark() >= 60)
        return i.getName() + " :" + "First Division";
      else if (i.getMark() >= 45) {
        return i.getName() + " :" + "Second";
      } else if (i.getMark() >= 33) {
        return i.getName() + " :" + "Third";
      } else {
        return i.getName() + " :" + "Failed";
      }
    };
    Predicate<Employee> predicate1 = employee -> employee.getMark() >= 60;
    Consumer<Employee> consumer = c -> {
      System.out.println(c.getName());
      System.out.println(c.getMark());
      System.out.println(function.apply(c));
      System.out.println();
    };
    for (Employee employee : list) {
      if (predicate1.test(employee))
        System.out.println(function.apply(employee));
    }
    for (Employee employee : list) {
      consumer.accept(employee);
    }

    System.out.println((int) (Math.random() * 10));

        /*wherever lambda expression is using(for functional interface's method
        implementation)we can use existing method by method reference(::)*/
    FilterDemo filterDemo = new FilterDemo();

    Supplier<?> supplier = filterDemo::m1;
                /*()->{
            String otp = "";
            for(int i=0;i<6;i++)
            {
                int random = (int)(Math.random()*10);
                otp = otp + random;
                System.out.println((int)(Math.random()*10));
            }
            return otp;
        };*/
    System.out.println(supplier.get());

    BiConsumer<Employee, Integer> biConsumer = (employee, marks) -> {
      if (employee.getMark() < 33)
        employee.mark = employee.mark + 10;
    };
    for (Employee employee : list) {
      biConsumer.accept(employee, 10);
      System.out.println("After Adding grace mark :" + employee);
    }

    BiFunction<String, Integer, Employee> biFunction = (name, age) -> new Employee(name, age);

    for (Employee employee : list) {
      System.out.println("*****" + biFunction.apply(employee.getName(), employee.getMark()));
    }
    List<Employee> collect = list.stream().filter(e -> e.getMark() >= 60).collect(Collectors.toList());
    collect.forEach(employee -> System.out.println("%%%%%\n" + employee.getName() + " " + employee.getMark()));
    List<String> lengthGreaterThanThree = namesList.stream().filter(e -> e.length() > 3).collect(Collectors.toList());
    System.out.println("Length greater than 3 :" + lengthGreaterThanThree);

    List<Integer> multiplyByTwo = numberList.stream().map(number -> number * 2).collect(Collectors.toList());
    System.out.println("Multiply each number by 2 :" + multiplyByTwo);

    list.stream()
            .map(employee -> employee.name)
            .forEach(name -> System.out.println("Employee Name: " + name));
   // System.out.println("Extracted Employees Name :" + employeeNameList);
    List<List<String>> fruitsList = Arrays.asList(
            Arrays.asList("Apple", "Banana", "Cherry"),
            Arrays.asList("Grapes", "Pineapple", "Mango"),
            Arrays.asList("Peach", "Plum", "Apricot"));
    List<String> flatFruits = fruitsList.stream().flatMap(List::stream).collect(Collectors.toList());
    System.out.println("Flatten Fruit List :"+ flatFruits);
   List<String> flattenList = fruitsList.stream().flatMap(list1 -> list1.stream()).filter(fruitName->fruitName.startsWith("A")).collect(Collectors.toList());
    System.out.println("Fruit Name Start with A : "+flattenList);
    for (String fruit : fruitsList.stream().flatMap(list1 -> list1.stream()).collect(Collectors.toList())) {
      System.out.println(fruit);
    }
    int sum = list.stream().mapToInt(i -> i.getMark()).sum();
    System.out.println("MMMMMMMMMMMMMMMMMMMMMMM +"+sum);

  }

  public String m1() {
    System.out.println("Inside m1");
    String otp = "";
    for (int i = 0; i < 6; i++) {
      int random = (int) (Math.random() * 10);
      otp = otp + random;
    }
    return otp;

  }
}
