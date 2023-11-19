package seminars.Badeev.seminar_006.Dependency_Inversion.was;

public class AnimalOwner {

    private Dog dog;

    public AnimalOwner() {
        this.dog = new Dog();
    }

    public void makeDogBark() {
        dog.bark();
    }
}
