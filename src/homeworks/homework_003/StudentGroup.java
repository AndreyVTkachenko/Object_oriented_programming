package homeworks.homework_003;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public StudentGroup(List<Student> studentList, List<Curator> curatorList) {
        this.studentList = studentList;
        this.curatorList = curatorList;
    }

    private List<Student> studentList = new ArrayList<>();
    private List<Curator> curatorList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;

    }

    public List<Curator> getTeacherList() {
        return curatorList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addTeacher(Curator curator) {
        this.curatorList.add(curator);
    }
}
