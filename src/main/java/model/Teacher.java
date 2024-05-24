package model;

import enums.UserType;

public class Teacher extends User{
    public Teacher(int id, String name, UserType userType) {
        super(id, name, userType);
    }
}
