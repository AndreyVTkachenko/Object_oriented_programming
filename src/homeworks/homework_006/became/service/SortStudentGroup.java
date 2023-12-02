package homeworks.homework_006.became.service;

import homeworks.homework_006.became.data.Student;

import java.util.List;

public interface SortStudentGroup extends StudentSortService{
    @Override
    List<Student> sortStudents();
}
