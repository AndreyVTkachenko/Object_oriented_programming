package seminars.Morozov.seminar_003;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinate;

    public Personal getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Возраст: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareFirstName = this.firstName.compareTo(o.firstName);
        if (compareFirstName != 0) {
            return compareFirstName;
        }
        int compareLastName = this.lastName.compareTo(o.lastName);
        if (compareLastName != 0) {
            return compareLastName;
        }
        return this.age - o.age;
//      if (this.age < o.age) {
//            return -1;
//        }
//        if (this.age > o.age) {
//            return 1;
//        }
//        return 0;
    }
}
