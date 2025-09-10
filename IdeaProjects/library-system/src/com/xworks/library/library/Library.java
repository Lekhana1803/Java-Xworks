package com.xworks.library.library;

import com.xworks.library.book.Book;

public class Library {

    public Book[] books;   // Public array like Hospital
    public int index;      // Public index to track added books

    // Constructor to initialize Library with size
    public Library(int size) {
        books = new Book[size];
        index = 0;
    }

    // Method to add a Book to the library
    public boolean addBook(Book book) {
        if (book != null && index < books.length) {
            books[index++] = book;
            return true;
        } else {
            System.out.println("Invalid Book or library capacity reached!");
            return false;
        }
    }

    // Method to display all Books
    public void getAllBooks() {
        System.out.println("Total book capacity: " + books.length);
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publisher: " + book.getPublisher());
                System.out.println("Year: " + book.getYear());
                System.out.println("Edition: " + book.getEdition());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Pages: " + book.getPages());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Language: " + book.getLanguage());
                System.out.println("Price: " + book.getPrice());
                System.out.println("Available: " + book.isAvailable());
                System.out.println("Shelf Number: " + book.getShelfNumber());
                System.out.println("Issued To: " + book.getIssuedTo());
                System.out.println("-----------------------------------");
            }
        }
    }
}

/*
public class Library {
    Book[] books = new Book[14];
    int index;

    public boolean addBook(Book book) {
        boolean isBookAdded = false;
        if (book != null ) {
            books[index++] = book;
            isBookAdded = true;
        }
        return isBookAdded;
    }

    public void getAllBooks() {
        System.out.println("List of Books:" +books.length);
        for (Book book : books) {
                System.out.println("ID: " +book.getBookId());
            System.out.printf("Title:" + book.getTitle());
            }
        }
    }*/
