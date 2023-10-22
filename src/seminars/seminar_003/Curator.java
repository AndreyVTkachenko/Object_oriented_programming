package seminars.seminar_003;

public class Curator extends User {

    private int teacherId;

    public Curator(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "Имя: " + super.getFirstName() +
                ", Отчество: " + super.getSecondName() +
                ", Фамилия: " + super.getLastName() +
                ", Идентификатор: " + teacherId;
    }
}
