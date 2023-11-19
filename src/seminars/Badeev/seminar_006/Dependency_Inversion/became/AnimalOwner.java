package seminars.Badeev.seminar_006.Dependency_Inversion.became;

public class AnimalOwner {

    private Animal animal;

    public AnimalOwner(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimalSound() {
        animal.makeSound();
    }
}
