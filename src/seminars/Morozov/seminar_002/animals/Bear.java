package seminars.Morozov.seminar_002.animals;

import seminars.Morozov.seminar_002.animals.base.Predator;
import seminars.Morozov.seminar_002.zoo.RunSpeed;
import seminars.Morozov.seminar_002.zoo.SwimSpeed;

public class Bear extends Predator implements RunSpeed, SwimSpeed {
    @Override
    public int getRunSpeed() {
        return 40;
    }

    public Bear(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Rear";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d, Swim: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }
}
