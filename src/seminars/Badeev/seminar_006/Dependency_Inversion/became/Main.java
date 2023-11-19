package seminars.Badeev.seminar_006.Dependency_Inversion.became;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        AnimalOwner dogOwner = new AnimalOwner(dog);
        // альтернативный вариант создания объекта класса
        AnimalOwner dogOwnerOther = new AnimalOwner(new Dog());

        dogOwner.makeAnimalSound(); // вывод: Dog barks.
        dogOwnerOther.makeAnimalSound(); // вывод: Dog barks.

        Cat cat = new Cat();
        AnimalOwner catOwner = new AnimalOwner(cat);
        // альтернативный вариант создания объекта класса
        AnimalOwner catOwnerOther = new AnimalOwner(new Cat());

        catOwner.makeAnimalSound(); // вывод: Cat meow.
        catOwnerOther.makeAnimalSound(); // вывод: Cat meow.
    }
}
