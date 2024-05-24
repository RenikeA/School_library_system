package model;

import enums.UserType;

public abstract class User {
    public int id;
    public String name;
    public UserType userType;

    public User(int id, String name, UserType userType) {
        this.id = id;
        this.name = name;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserType getUserType() {
        return userType;
    }
}
