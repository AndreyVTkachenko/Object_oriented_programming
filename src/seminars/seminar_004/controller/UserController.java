package seminars.seminar_004.controller;

import seminars.seminar_004.data.User;

public interface UserController <T extends User> {
    void create (String firstName, String secondName, String lastName);
}
