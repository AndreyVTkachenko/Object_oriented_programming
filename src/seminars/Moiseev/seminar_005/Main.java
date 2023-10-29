package seminars.Moiseev.seminar_005;

import seminars.Moiseev.seminar_005.controller.Controller;

public class Main {
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
        System.out.println("Студенты: ");
        controller.getAllStudent();

        controller.createTeacher("zzz", "zzz", "zzz");
        controller.createTeacher("yyy", "yyy", "yyy");
        controller.createTeacher("xxx", "xxx", "xxx");
        System.out.println("Педагоги: ");
        controller.getAllTeacher();
    }
}
