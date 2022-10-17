package com.nonursis.BookManagementSystem;


import java.util.Date;

public class Book {
    private String number;
    private String name;
    private Date date;  // entry date
    private String Author;
    private int numberOfPages;

    public Book(String number, String name, Date date, String author, int numberOfPages) {
        this.number = number;
        this.name = name;
        this.date = date;
        Author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", Author='" + Author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
