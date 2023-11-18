package homeworks.homework_005;

import homeworks.homework_005.controller.Controller;
import homeworks.homework_005.model.Student;
import homeworks.homework_005.model.Teacher;

import java.util.List;

public class Main {
    private static List<Student> studentList;
    private static Teacher teacher;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("aaa", "aaa", "aaa");
        controller.createStudent("bbb", "bbb", "bbb");
        controller.createStudent("ccc", "ccc", "ccc");
        controller.createStudent("ddd", "ddd", "ddd");
        controller.createStudent("eee", "eee", "eee");
        controller.createStudent("fff", "fff", "fff");
        controller.createStudent("ggg", "ggg", "ggg");
        controller.createStudent("hhh", "hhh", "hhh");
        controller.createStudent("iii", "iii", "iii");
        controller.createStudent("jjj", "jjj", "jjj");
//        controller.getAllStudent();

        controller.createTeacher("zzz", "zzz", "zzz");
//        controller.getAllTeacher();

        controller.createStudyGroup(studentList, teacher);
        controller.getAllStudyGroup();
    }
}
