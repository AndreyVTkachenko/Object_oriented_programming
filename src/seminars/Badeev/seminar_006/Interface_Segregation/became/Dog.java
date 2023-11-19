package seminars.Badeev.seminar_006.Interface_Segregation.became;

public class Dog extends Animal implements Fetchable {

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void fetch() {
        System.out.println("Dog fetches.");
    }
}
