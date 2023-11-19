package seminars.Badeev.seminar_006.Liskov_Substitution.was;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void fetch() {
        System.out.println("Dog fetches.");
    }
}
