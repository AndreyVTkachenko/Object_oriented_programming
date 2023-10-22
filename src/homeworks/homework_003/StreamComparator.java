package homeworks.homework_003;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    public int compare(StudentGroup group1, StudentGroup group2) {
        int groupCount1 = group1.getStudentList().size();
        int groupCount2 = group2.getStudentList().size();

        return Integer.compare(groupCount1, groupCount2);
    }
}
