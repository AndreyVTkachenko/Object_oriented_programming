package seminars.Morozov.seminar_002.animals.base;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "grass";
    }
}
