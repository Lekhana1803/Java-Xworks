package com.xworks.library;

import com.xworks.library.book.Book;
import com.xworks.library.library.Library;

import java.util.Scanner;

public class LibraryRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of books to be added:");
        int size = scanner.nextInt();

        Library library = new Library(size); // Library class with Book array
        System.out.println("Books available capacity: " + library.books.length);

        for (int i = 0; i < size; i++) {
            Book book = new Book();

            System.out.println("Enter book ID:");
            book.setBookId(scanner.nextInt());

            System.out.println("Enter title:");
            book.setTitle(scanner.next());

            System.out.println("Enter author:");
            book.setAuthor(scanner.next());

            System.out.println("Enter publisher:");
            book.setPublisher(scanner.next());

            System.out.println("Enter year of publication:");
            book.setYear(scanner.nextInt());

            System.out.println("Enter edition:");
            book.setEdition(scanner.next());

            System.out.println("Enter ISBN:");
            book.setIsbn(scanner.next());

            System.out.println("Enter number of pages:");
            book.setPages(scanner.nextInt());

            System.out.println("Enter genre:");
            book.setGenre(scanner.next());

            System.out.println("Enter language:");
            book.setLanguage(scanner.next());

            System.out.println("Enter price:");
            book.setPrice(scanner.nextDouble());

            System.out.println("Is the book available? (true/false):");
            book.setAvailable(scanner.nextBoolean());

            System.out.println("Enter shelf number:");
            book.setShelfNumber(scanner.next());

            System.out.println("Enter issued to (if any, else enter 'none'):");
            book.setIssuedTo(scanner.next());

            library.addBook(book);
        }

        library.getAllBooks();
    }
}

/*
public class LibraryRunner {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setBookId(1);
        book1.setTitle("Java Basics");

        Book book2 = new Book();
        book2.setBookId(2);
        book2.setTitle("Python 101");

        Book book3 = new Book();
        book3.setBookId(3);
        book3.setTitle("C Programming");

        Book book4 = new Book();
        book4.setBookId(4);
        book4.setTitle("Data Structures");

        Book book5 = new Book();
        book5.setBookId(5);
        book5.setTitle("Algorithms");

        Book book6 = new Book();
        book6.setBookId(6);
        book6.setTitle("Operating Systems");

        Book book7 = new Book();
        book7.setBookId(7);
        book7.setTitle("Database Systems");

        Book book8 = new Book();
        book8.setBookId(8);
        book8.setTitle("Computer Networks");

        Book book9 = new Book();
        book9.setBookId(9);
        book9.setTitle("Machine Learning");

        Book book10 = new Book();
        book10.setBookId(10);
        book10.setTitle("Artificial Intelligence");

        Book book11 = new Book();
        book11.setBookId(11);
        book11.setTitle("Cloud Computing");

        Book book12 = new Book();
        book12.setBookId(12);
        book12.setTitle("Big Data");

        Book book13 = new Book();
        book13.setBookId(13);
        book13.setTitle("Cyber Security");

        Book book14 = new Book();
        book14.setBookId(14);
        book14.setTitle("Software Engineering");

        // Add to Library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);

        // Print all Books
        library.getAllBooks();
    }
}*/

