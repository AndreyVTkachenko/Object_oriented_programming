package seminars.Moiseev.seminar_004.view;

import seminars.Moiseev.seminar_004.data.Student;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
