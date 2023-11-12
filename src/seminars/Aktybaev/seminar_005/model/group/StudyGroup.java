package seminars.Aktybaev.seminar_005.model.group;

import seminars.Aktybaev.seminar_005.model.group.iterators.StudentIterator;
import seminars.Aktybaev.seminar_005.model.student.comparators.StudentComparatorByAge;
import seminars.Aktybaev.seminar_005.model.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends GroupItem> implements Iterable<E> {
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student){

        studentList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge<>());
    }
}
