package seminars.Badeev.seminar_003.task_007;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", 5, 30));
        animals.add(new Animal("Dog", 3, 40));
        animals.add(new Animal("Elephant", 10, 200));
        animals.add(new Animal("Lion", 7, 90));

        // Создаём компаратор для сравнения сначала по возрасту, затем по росту
        Comparator<Animal> ageAndHeightComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                // Сравниваем по возрасту
                int ageCompare = animal1.getAge() - animal2.getAge();
                if (ageCompare != 0) {
                    return ageCompare;
                }
                // При равенстве возраста сравниваем по росту
                return animal1.getHeight() - animal2.getHeight();
            }
        };

        // Сортируем список животных при помощи компаратора
        animals.sort(ageAndHeightComparator);

        // Выводим отсортированный список животных
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
