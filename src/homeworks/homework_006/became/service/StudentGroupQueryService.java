package homeworks.homework_006.became.service;

import homeworks.homework_006.became.data.Student;
import homeworks.homework_006.became.data.StudentGroup;

import java.util.List;

abstract class StudentGroupQueryService {
    abstract Student findStudent(String firstName, String secondName);
    abstract List<Student> sortStudents(StudentGroup studentGroup);
}
