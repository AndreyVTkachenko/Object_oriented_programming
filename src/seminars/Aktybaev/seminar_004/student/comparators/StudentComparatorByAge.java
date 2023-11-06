package seminars.Aktybaev.seminar_004.student.comparators;

import seminars.Aktybaev.seminar_004.group.StudyGroupItem;

import java.util.Comparator;

public class StudentComparatorByAge<T extends StudyGroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
        // либо
        // return o1.getAge() - o2.getAge()
    }
}
