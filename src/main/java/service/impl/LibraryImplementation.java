package service.impl;

import model.Library;
import service.LibraryService;

public class LibraryImplementation  extends Library {
    public LibraryImplementation() {
        super(new LibraryServiceImpl());
    }
}
