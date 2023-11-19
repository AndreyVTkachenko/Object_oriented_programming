package seminars.Badeev.seminar_006.Dependency_Inversion.became;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
