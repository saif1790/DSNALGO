package com.exception;

import java.util.Scanner;

public class CustomException {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();  // reads a line of text

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();  // reads an integer

    System.out.println("Hello " + name + ", you are " + age + " years old.");

    if(age < 18)
    {
      throw new AgeNotAdultException(age + " :" + "is not eligible for this post");
    } else if (age > 70) {
      throw new OldAgeException(age +  " :" + "is not eligible for this post because it is over Age");
    }else {
      System.out.println("Welcome to this post");
    }
    scanner.close();  // good practice to close scanner

  }
}

