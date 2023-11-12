package seminars.Aktybaev.seminar_005.model.student.comparators;

import seminars.Aktybaev.seminar_005.model.group.GroupItem;

import java.util.Comparator;

public class StudentComparatorByName<T extends GroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
