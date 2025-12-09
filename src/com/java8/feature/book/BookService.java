package com.java8.feature.book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    /*
     (o1,o2) -> o2.getBookName().compareTo(o1.getBookName());
    */

  public static void main(String[] args) {

    BookService bookService = new BookService();
    System.out.println("Sorting By BookName :" + bookService.getBookSortByName());
    bookService.getBookSortByPageNumber();
    System.out.println("Sorting By PageNumber :" + bookService.getBookSortByPageNumber());
  }

  /*
      (o1,o2) -> o1.getPageNumber().compareTo(o2.getPageNumber());

  */
  public List<Book> getBookSortByName() {

    List<Book> listOfBooks = new BookDAO().getListOfBooks();
    // System.out.println("Before Sorting :"+listOfBooks);
    Collections.sort(listOfBooks, (o1, o2) -> o1.getBookName().compareTo(o2.getBookName()));
    return listOfBooks;
  }

  public List<Book> getBookSortByPageNumber() {

    List<Book> listOfBooks = new BookDAO().getListOfBooks();
    //System.out.println("Before Sorting :"+listOfBooks);

    Collections.sort(listOfBooks, (o1, o2) -> o1.getPageNumber().compareTo(o2.getPageNumber()));
    return listOfBooks;
  }
}

/*
class BookNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getBookName().compareTo(o1.getBookName());
    }
}
*/

   /* class PageNumberComparator implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o2.getPageNumber().compareTo(o1.getPageNumber());
        }
    }*/
