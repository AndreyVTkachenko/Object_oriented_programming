package homeworks.homework_004.controller;

import homeworks.homework_004.data.User;

public interface UserController <T extends User> {
    void create (String firstName, String secondName, String lastName);
}
