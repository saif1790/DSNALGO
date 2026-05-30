package com.java8.feature.stream.filter;

import java.util.Arrays;
import java.util.List;

public class Employee {

    String name;
    Integer mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Employee(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public static void main(String[] args)
    {

        List<Employee> list = Arrays.asList(
                 new Employee("saif", 33)
                , new Employee("sam", 30)
                , new Employee("waseem", 32)
                , new Employee("azhar", 34)
        );
        /*List<Employee> collect = list.stream().filter(emp -> emp.age > 32).collect(Collectors.toList());
        System.out.println(collect);*/

    }
}

