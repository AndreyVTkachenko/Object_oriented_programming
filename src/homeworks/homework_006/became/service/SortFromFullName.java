package homeworks.homework_006.became.service;

import homeworks.homework_006.became.data.Student;

import java.util.List;

public interface SortFromFullName extends StudentSortService {

    @Override
    List<Student> sortStudents();
}
