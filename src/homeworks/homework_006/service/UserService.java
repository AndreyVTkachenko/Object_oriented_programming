package homeworks.homework_006.service;

import homeworks.homework_006.data.User;

import java.util.List;

public interface UserService <T extends User> {
    void create (String firstName, String secondName, String lastName);
    List<T> getAll();
}
