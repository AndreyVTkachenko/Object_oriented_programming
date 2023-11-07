package seminars.Morozov.seminar_002;

import seminars.Morozov.seminar_002.animals.Bear;
import seminars.Morozov.seminar_002.animals.Cow;
import seminars.Morozov.seminar_002.animals.Crow;
import seminars.Morozov.seminar_002.animals.Duck;
import seminars.Morozov.seminar_002.animals.base.Animal;
import seminars.Morozov.seminar_002.zoo.FlySpeed;
import seminars.Morozov.seminar_002.zoo.RunSpeed;
import seminars.Morozov.seminar_002.zoo.SwimSpeed;
import seminars.Morozov.seminar_002.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Мурка");

        System.out.println(bear); // отдельный вывод медведя
        System.out.println(cow); // отдельный вывод коровы

        System.out.println("_________________________________________________________________________________________");

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Дональд")).addAnimal(new Crow("Клара"));
        System.out.println(zoo);

        System.out.println("_________________________________________________________________________________________");

        System.out.println(zoo.getSound());

        System.out.println("_________________________________________________________________________________________");

        RunSpeed champion = zoo.getRunnerChampion();
        System.out.println("Чемпион по скорости бега:\n" + champion);

        System.out.println("_________________________________________________________________________________________");

        FlySpeed leader = zoo.getFlyerChampion();
        System.out.println("Чемпион по скорости полёта:\n" + leader);

        System.out.println("_________________________________________________________________________________________");

        SwimSpeed favorite = zoo.getSwimmerChampion();
        System.out.println("Чемпион по скорости плавания:\n" + favorite);
    }
}
