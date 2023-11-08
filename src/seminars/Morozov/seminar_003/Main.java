package seminars.Morozov.seminar_003;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Personal personal1 = new Personal();
        personal1.addUser(new User("Иван", "Иванов", 21))
                .addUser(new User("Пётр", "Петров", 25))
                .addUser(new User("Мария", "Семёнова", 18))
                .addUser(new User("Тамара", "Кузнецова", 38))
                .addUser(new User("Сергей", "Петров", 32))
                .addUser(new User("Ирина", "Рязанова", 35))
                .addUser(new User("Степан", "Иванов", 36));
        for (User user : personal1) {
            System.out.println(user);
        }

        System.out.println("_________________________________________________________________________________________");

        List<User> users = personal1.toList();
        Collections.sort(users);
        System.out.println(users);

        System.out.println("_________________________________________________________________________________________");

        Personal personal2 = new Personal();
        personal2.addUser(new User("Артём", "Смирнов", 30));

        User user = new User("Татьяна", "Сидорова", 39);
        user.setSubordinate(personal1);

        personal2.addUser(user);
        User boss = new User("Андрей", "Ткаченко", 44);
        boss.setSubordinate(personal2);

        Company company = new Company(boss);
        for (User item : company) {
            System.out.println(item);
        }
    }
}
