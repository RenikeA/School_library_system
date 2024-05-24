package service.impl;

import model.Book;
import model.User;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private List<Book>books = new ArrayList<>();


    @Override
    public void borrowBook(Book book, User user) {
        if (books.contains(book) && book.availableCopies > 0){
           book.availableCopies--;
            System.out.println("Book borrowed Successfully");
        }else {
           //System.out.println("Book is not available");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (!books.contains(book) && book.availableCopies > 0){
            book.availableCopies++;
            System.out.println("Book is available in the library");
        }else {
            System.out.println("Book is not in the library");
        }

    }


}