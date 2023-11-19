package seminars.Badeev.seminar_006.Open_Closed.became;

public class Dog implements IMakeSound {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
