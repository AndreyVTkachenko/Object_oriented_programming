package seminars.Badeev.seminar_006.Liskov_Substitution.became;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // вывод: Dog Barks.
        animal2.makeSound(); // вывод: Cat meows.

        // теперь нет нарушения принципа LSP
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1; // преобразование типа
            dog.fetch(); // вывод: Dog fetches.
        }

        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2; // преобразование типа
            cat.scratch(); // вывод: Cat scratch.
        }


        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------");

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal:
                animals) {
            animal.makeSound();
        }

        //-------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------");
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
