package model;

import service.LibraryService;
import service.impl.UserComparator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Library {
    private LibraryService libraryService;
  private PriorityQueue<User> borrowingQueue = new PriorityQueue<>(new UserComparator());//uncomment for
//    priority queue
//    private Queue<User>borrowingQueue =new LinkedList<>();

    public Library(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void borrowBook(Book book , User user){
        borrowingQueue.add(user); // Adding users to the priority queue
        libraryService.borrowBook(book, user);
    }



    public void returnBook(Book book){
        libraryService.returnBook(book);
    }

    public void processingBorrowingQueue(Book book){
        while (!borrowingQueue.isEmpty()){
            User user = borrowingQueue.poll(); // PQ logic
           libraryService.borrowBook(book, user);// comment this side out for the PQ to implement
            // first come first serve
            System.out.println(" Borrower: "+ " " + user.name +" has borrowed a book");
        }

    }
}

