package com.collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

  public static void main(String[] args) {

    CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    list.add("Java");
    list.add("Spring");
    System.out.println(list);

    for(String s : list){
      list.add("boot");
      System.out.println(s);
    }
    System.out.println(list);
  }
}
