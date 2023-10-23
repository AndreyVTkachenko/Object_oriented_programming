package seminars.seminar_004.data;

public class Student extends User implements Comparable<Student> {
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Имя: " + super.getFirstName() +
                ", Отчество: " + super.getSecondName() +
                ", Фамилия: " + super.getLastName() +
                ", Идентификатор: " + studentId;
    }

    @Override
    public int compareTo(Student o) {
        if (o.getStudentId() > studentId) {
            return -1;
        }
        if (o.getStudentId() < studentId) {
            return 1;
        }
        return 0;
    }
}
