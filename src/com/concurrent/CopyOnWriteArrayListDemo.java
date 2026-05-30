package com.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

  public static void main(String[] args) {

    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
    copyOnWriteArrayList.add("A");
    copyOnWriteArrayList.add("B");
    copyOnWriteArrayList.add("A");
    copyOnWriteArrayList.add("C");

    Iterator iterator = copyOnWriteArrayList.iterator();

    while (iterator.hasNext())
    {
      String s = (String)iterator.next();
      if (s.equals("C"))
        iterator.remove();
    }
  }
}
