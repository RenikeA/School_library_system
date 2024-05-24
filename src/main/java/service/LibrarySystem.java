package service;

import enums.UserType;
import model.*;
import service.impl.LibraryImplementation;
import service.impl.LibraryServiceImpl;

public class LibrarySystem {
    public static void main(String[] args) {

        // Create priority for teacher and student

        Students student1 = new Students(1, "Jane Frances", UserType.STUDENT);
        Teacher teacher1 = new Teacher(1, "segun osiki", UserType.TEACHER);

        // Create priority for Senior and junior student

        Students juniorStudent = new Students(1, "Jane Frances", UserType.JUNIOR);
        Students seniorStudent = new Students(12, "Yomi Akinboh", UserType.SENIOR);


        // Create book instance
        Book book1 = new Book("Java Fundamentals", "Temitope Akinboh", 1);


        LibraryService libraryService = new LibraryServiceImpl();
        Library library = new LibraryImplementation(); // // for priority Queue

       // LibraryServiceImpl libraryService = new LibraryServiceImpl();


        library.borrowBook(book1,student1);
        library.borrowBook(book1,teacher1);


        library.borrowBook(book1,juniorStudent);
        library.borrowBook(book1,seniorStudent);


        library.processingBorrowingQueue(book1);// YOU CAN REMOVE THE PARAMETER AND

        // FROM LIBRARY CLASS, DONT FORGET!!
//        library.returnBook(book1);
//        library.returnBook(book1);






    }
}
