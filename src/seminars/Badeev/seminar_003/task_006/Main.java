package seminars.Badeev.seminar_003.task_006;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", 5));
        animals.add(new Animal("Dog", 3));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Lion", 7));

        // Создаём компаратор для сравнения по возрасту при помощи лямбда-выражения
        Comparator<Animal> ageComparator = (animal1, animal2) -> animal1.getAge() - animal2.getAge();

        // Сортируем список животных с помощью компаратора
        animals.sort(ageComparator);

        // Выводим отсортированный список животных
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
