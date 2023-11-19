package seminars.Badeev.seminar_006.Interface_Segregation.became;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // вывод: Dog Barks.
        animal2.makeSound(); // вывод: Cat meows.

        if (animal1 instanceof Fetchable) {
            Fetchable dog1 = (Fetchable) animal1; // преобразование типа
            dog1.fetch(); // вывод: Dog fetches.
        }

        if (animal2 instanceof Scratchable) {
            Scratchable cat1 = (Scratchable) animal2; // преобразование типа
            cat1.scratch(); // вывод: Cat scratch.
        }
    }
}
