package com.java8.feature.foreachDemo;

import java.util.List;
import java.util.stream.Collectors;

// employee having salary more than 5 lakhs  is elegible for tax
public class TaxService {

    public static List<Employee> getTaxEligibleEmployees(String input) {


        List<Employee> employee = EmployeeDatabase.getEmployee();
        return (input.equalsIgnoreCase("tax")) ?
                employee.stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : employee.stream().
                filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Eligible TAX payer Employees List :\n");
        //System.out.println("Tax payer :" + TaxService.getTaxEligibleEmployees("tax"));
        System.out.println("Non Tax-payer" + TaxService.getTaxEligibleEmployees("non-tax"));
    }
}
