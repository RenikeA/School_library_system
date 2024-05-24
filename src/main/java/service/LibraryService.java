package service;

import model.Book;
import model.User;

public interface LibraryService {
    void borrowBook(Book book, User user);
    void returnBook(Book book);
    //void borrowBook(Book book);
}


