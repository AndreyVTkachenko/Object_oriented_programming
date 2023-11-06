package seminars.Aktybaev.seminar_004.service;

import seminars.Aktybaev.seminar_004.group.StudyGroup;
import seminars.Aktybaev.seminar_004.student.Student;

public class Service {
    private StudyGroup<Student> studyGroup;
    private int id;

    public Service() {
        studyGroup = new StudyGroup<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(id++, name, age);
        studyGroup.addStudent(student);
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов: \n");

//        Замена цикла foreach (тоже самое)
//        Iterator<Student> iterator = studyGroup.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }

        for (Student student : studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        studyGroup.sortByName();
    }

    public void sortByAge() {
        studyGroup.sortByAge();
    }
}
