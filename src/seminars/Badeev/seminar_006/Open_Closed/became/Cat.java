package seminars.Badeev.seminar_006.Open_Closed.became;

public class Cat implements IMakeSound {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
