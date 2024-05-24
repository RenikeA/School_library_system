package service.impl;

import enums.UserType;
import model.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        if (user1.userType == UserType.TEACHER && user2.userType == UserType.STUDENT){
            return -1;
        }else if (user1.userType == user2.userType){
            return Integer.compare((user1.id),(user2.id));// fcfs for same user type
        } else if (user1.userType == UserType.SENIOR && user2.userType == UserType.JUNIOR) {
            return -1;
        } else {
            return 1; //  students have lower priority than teachers
        }
    }
}
