package seminars.Aktybaev.seminar_003;

import seminars.Aktybaev.seminar_003.service.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.addStudent("Павел", 18);
        service.addStudent("Дарья", 19);
        service.addStudent("Игорь", 21);
        service.addStudent("Мария", 20);

        System.out.println(service.getInfo());
        service.sortByName();
        System.out.println(service.getInfo());
        service.sortByAge();
        System.out.println(service.getInfo());
    }
}
