package seminars.seminar_004.controller;

import seminars.seminar_004.data.Student;
import seminars.seminar_004.service.StudentService;
import seminars.seminar_004.view.StudentView;

import java.util.List;

public class StudentController implements UserController{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    public List<Student> getAllStudents() {
        return studentService.getAll();
    }

    public void printAllStudent() {
        studentView.sendOnConsole(getAllStudents());
    }
}
