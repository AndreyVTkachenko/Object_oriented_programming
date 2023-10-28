package seminars.Moiseev.seminar_003;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentList;

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    public void zeroCounter () {
        counter = 0;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        /*Пропускаем студента с идентификатором 1004
        if (studentList.get(counter).getStudentId() == 1004) {
            counter++;
            return next();
        }
        */
        else {
            return studentList.get(counter++);
        }
    }

    @Override
    public void remove() {
        studentList.remove(--counter);
    }

    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }
}
