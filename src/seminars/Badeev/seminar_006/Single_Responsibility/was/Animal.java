package seminars.Badeev.seminar_006.Single_Responsibility.was;

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

    public void eat() {
        // код для питания животного
    }

    public void sleep() {
        // код для сна животного
    }

    public void reproduce() {
        // код для размножения животного
    }
}
