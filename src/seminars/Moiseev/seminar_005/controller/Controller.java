package seminars.Moiseev.seminar_005.controller;

import seminars.Moiseev.seminar_005.model.Student;
import seminars.Moiseev.seminar_005.model.Teacher;
import seminars.Moiseev.seminar_005.model.Type;
import seminars.Moiseev.seminar_005.model.User;
import seminars.Moiseev.seminar_005.service.DataService;
import seminars.Moiseev.seminar_005.view.StudentView;
import seminars.Moiseev.seminar_005.view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
}
