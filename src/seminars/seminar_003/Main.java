package seminars.seminar_003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Иван", "Иванович", "Иванов", 1001);
        Student student02 = new Student("Пётр", "Петрович", "Петров", 1002);
        Student student03 = new Student("Сидор", "Сидорович", "Сидоров", 1003);
        Student student04 = new Student("Иван", "Петрович", "Иванов", 1004);
        Student student05 = new Student("Пётр", "Иванович", "Иванов", 1005);
        Student student06 = new Student("Иван", "Иванович", "Сидоров", 1006);
        Student student07 = new Student("Иван", "Петрович", "Сидоров", 1007);
        Student student08 = new Student("Сидор", "Иванович", "Сидоров", 1008);
        Student student09 = new Student("Иван", "Сидорович", "Иванов", 1009);
        Student student10 = new Student("Иван", "Сидорович", "Петров", 1010);
        Student student11 = new Student("Сидор", "Петрович", "Иванов", 1011);
        Student student12 = new Student("Пётр", "Сидорович", "Сидоров", 1012);
        Teacher teacher = new Teacher("Сергей", "Сергеевич", "Сергеев", 9001);

        List<Student> list = new ArrayList<>();
        list.add(student04);
        list.add(student02);
        list.add(student03);
        list.add(student10);
        list.add(student01);
        list.add(student06);
        list.add(student05);
        list.add(student08);
        list.add(student12);
        list.add(student07);
        list.add(student11);
        list.add(student09);


        StudentGroup studentGroup = new StudentGroup(list, teacher);
//        testIterator(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        Collections.sort(list); // сортировка по ID
        System.out.println();
        list.sort(new StudentComparator()); // сортировка по фамилии
        System.out.println();
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        testIterator(studentGroup);
    }

    public static void testIterator(StudentGroup studentGroup) {
        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
        }
        groupIterator.zeroCounter();
        while (groupIterator.hasNext()) {
            Student student = groupIterator.next();
            if (student.getStudentId() == 1007) {
                groupIterator.remove();
            }
        }
        System.out.println();
        groupIterator.zeroCounter();
        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
        }
    }
}