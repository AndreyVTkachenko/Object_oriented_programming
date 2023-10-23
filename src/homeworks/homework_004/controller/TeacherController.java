package homeworks.homework_004.controller;

import homeworks.homework_004.data.Teacher;
import homeworks.homework_004.service.TeacherService;
import homeworks.homework_004.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public List<Teacher> getAllTeacher() {
        return teacherService.getAll();
    }

    public void printAllTeacher() {
        teacherView.sendOnConsole(getAllTeacher());
    }
}
