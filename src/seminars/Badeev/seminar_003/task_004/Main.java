package seminars.Badeev.seminar_003.task_004;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new  ArrayList<>();
        animals.add(new Animal("Cat", 5));
        animals.add(new Animal("Dog", 3));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Lion", 7));

//        // Используем лямбда-выражение в компараторе для сортировки по возрасту (неявное указание)
//        animals.sort((animal1, animal2) -> animal1.getAge() - animal2.getAge());

        // Список животных автоматически отсортирован по возрасту (явное указание - в классе Animal переопределён
        // метод compareTo)
        animals.sort(null);

        // Выводим отсортированный список животных
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
