package com.nonursis.BookManagementSystem;


import java.util.Date;

public class Book extends CatalogItem{
    private String Author;
    private int numberOfPages;

    public Book(String code, String title, Date publishDate, String author, int numberOfPages) {
        super(code, title, publishDate);
        Author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                ", Author='" + Author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
