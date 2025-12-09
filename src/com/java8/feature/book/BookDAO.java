package com.java8.feature.book;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

  public List<Book> getListOfBooks() {

    List<Book> books = new ArrayList<>();
    books.add(new Book(101, "Core Java", "400"));
    books.add(new Book(102, "Advance Java", "120"));
    books.add(new Book(103, "SpringBoot", "200"));
    books.add(new Book(104, "MicroServices", "210"));

    return books;
  }
}
