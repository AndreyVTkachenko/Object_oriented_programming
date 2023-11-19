package seminars.Badeev.seminar_006.Open_Closed.was;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Unknown sound");
    }
}

