package com.java8.feature.foreachDemo;

import java.util.ArrayList;
import java.util.List;

//DAO layer
public class EmployeeDatabase {

    public static List<Employee> getEmployee() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"saif","IT",500000));
        employees.add(new Employee(2,"sam","Devops",400000));
        employees.add(new Employee(3,"azhar","Accountant",900000));
        employees.add(new Employee(4,"mony","IT",1200000));
        return employees;

    }
}
