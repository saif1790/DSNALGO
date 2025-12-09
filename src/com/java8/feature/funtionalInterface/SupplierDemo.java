package com.java8.feature.funtionalInterface;

import com.java8.feature.FunctionalInterfaceTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {
   /* @Override
    public Object get() {
        return "Hello Saif";
    }*/

    public static void main(String[] args) {
       /* SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());*/

        //Supplier<String> supplier = () -> "Hello Saif";
        //System.out.println(supplier.get());
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hello Saif"));
    }
}
