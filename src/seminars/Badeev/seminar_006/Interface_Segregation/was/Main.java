package seminars.Badeev.seminar_006.Interface_Segregation.was;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // вывод: Dog Barks.
        animal2.makeSound(); // вывод: Cat meows.

        // в этом месте нарушение принципа LSP
        Dog dog = (Dog) animal1; // преобразование типа
        dog.fetch(); // вывод: Dog fetches.
    }
}
