package seminars.Badeev.seminar_006.Single_Responsibility.became;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        // код для перемещения животного
    }

    public void makeSound() {
        // код для издания звука
    }
}

