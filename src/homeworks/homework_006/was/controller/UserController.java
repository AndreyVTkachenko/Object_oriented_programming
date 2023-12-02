package homeworks.homework_006.was.controller;

import homeworks.homework_006.was.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
