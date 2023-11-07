package seminars.Morozov.seminar_002.animals;

import seminars.Morozov.seminar_002.animals.base.Herbivores;
import seminars.Morozov.seminar_002.zoo.RunSpeed;

public class Cow extends Herbivores implements RunSpeed {
    @Override
    public int getRunSpeed() {
        return 25;
    }

    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Moo";
    }

    @Override
    public String toString() {
        return String.format("Cow: %s, Speed: %d", super.toString(), getRunSpeed());
    }
}
