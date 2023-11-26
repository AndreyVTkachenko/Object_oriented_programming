package seminars.Moiseev.seminar_007.observer;

public class Main {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 200);
        Company geekBrains = new Company(jobAgency, "Geek Brains", 150);

        Student petrov = new Student("Петров");
        JuniorDeveloper ivanov = new JuniorDeveloper("Иванов");
        SeniorDeveloper smirnov = new SeniorDeveloper("Смирнов");

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(smirnov);

        for (int i = 0; i < 10; i++) {
            google.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
