package homeworks.homework_006.controller;

import homeworks.homework_006.data.User;

public interface UserController <T extends User> {
    void create (String firstName, String secondName, String lastName);
}
