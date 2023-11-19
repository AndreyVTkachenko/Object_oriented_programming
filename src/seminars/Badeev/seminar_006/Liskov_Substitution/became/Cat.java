package seminars.Badeev.seminar_006.Liskov_Substitution.became;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    public void scratch() {
        System.out.println("Cat scratches.");
    }
}
