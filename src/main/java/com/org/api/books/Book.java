package com.org.api.books;

public class Book {
    private  String isbn;
    private  String title;
    private  String author;

    public Book(String isbn, String title,String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn(String newIsbn) {
    }
    void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
    }
}