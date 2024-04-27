package com.java8.feature;


@FunctionalInterface
public interface FunctionalInterfaceTest {

    public String sum();
    default  void sum1(){}
    default  void sum4(){}

    public static void sum2(){}
}

