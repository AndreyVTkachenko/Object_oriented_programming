package seminars.Badeev.seminar_006.Interface_Segregation.became;

public class Cat extends Animal implements Scratchable {

    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    @Override
    public void scratch() {
        System.out.println("Cat scratches.");
    }
}
