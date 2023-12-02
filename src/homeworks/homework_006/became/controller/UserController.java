package homeworks.homework_006.became.controller;

import homeworks.homework_006.became.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
