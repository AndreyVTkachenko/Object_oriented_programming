package seminars.Morozov.seminar_002.animals;

import seminars.Morozov.seminar_002.animals.base.Bird;
import seminars.Morozov.seminar_002.zoo.FlySpeed;
import seminars.Morozov.seminar_002.zoo.RunSpeed;

public class Crow extends Bird implements RunSpeed, FlySpeed {
    public Crow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Сaws";
    }

    @Override
    public String feed() {
        return "Omnivore";
    }

    @Override
    public int getRunSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Crow: %s, Speed: %d, Fly: %d", super.toString(), getRunSpeed(), getFlySpeed());
    }

    @Override
    public int getFlySpeed() {
        return 60;
    }
}
