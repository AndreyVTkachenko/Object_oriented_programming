package seminars.Badeev.seminar_006.Open_Closed.became;

public class Bird implements IMakeSound {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}
