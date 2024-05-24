package model;

public class Book {
    String title;
    String author;
    public int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getAvailableCopies() {
//        return availableCopies;
//    }
}
