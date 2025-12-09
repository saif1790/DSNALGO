package com.java8.feature.book;

public class Book {
  private int bookID;
  private String bookName;
  private String pageNumber;

  public Book(int bookID, String bookName, String pageNumber) {
    this.bookID = bookID;
    this.bookName = bookName;
    this.pageNumber = pageNumber;
  }

  public int getBookID() {
    return bookID;
  }

  public void setBookID(int bookID) {
    this.bookID = bookID;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookID=" + bookID +
            ", bookName='" + bookName + '\'' +
            ", pageNumber='" + pageNumber + '\'' +
            '}';
  }
}
