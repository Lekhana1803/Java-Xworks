package com.xworks.library.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String edition;
    private String isbn;
    private int pages;
    private String genre;
    private String language;
    private double price;
    private boolean available;
    private String shelfNumber;
    private String issuedTo;

}