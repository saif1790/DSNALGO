package com.java8.feature;


/*@FunctionalInterface
public interface child extends FunctionalInterfaceTest {
    public void sum();

}*/

public interface child{

    default int sum(){
        System.out.println("Hello");return 0;}}