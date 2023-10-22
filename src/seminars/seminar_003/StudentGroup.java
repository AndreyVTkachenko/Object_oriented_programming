package seminars.seminar_003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList = new ArrayList<>();
    private Curator teacher;

    public StudentGroup(List<Student> list, Curator teacher) {
        this.studentList = list;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Curator getTeacher() {
        return teacher;
    }

    public void setTeacher(Curator teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
