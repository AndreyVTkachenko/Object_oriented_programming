package seminars.Morozov.seminar_002.animals;

import seminars.Morozov.seminar_002.animals.base.Bird;
import seminars.Morozov.seminar_002.zoo.FlySpeed;
import seminars.Morozov.seminar_002.zoo.RunSpeed;
import seminars.Morozov.seminar_002.zoo.SwimSpeed;

public class Duck extends Bird implements RunSpeed, FlySpeed, SwimSpeed {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Quacks";
    }

    @Override
    public String feed() {
        return "Omnivore";
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, Fly: %d, Swim: %d",
                super.toString(), getRunSpeed(), getFlySpeed(), getSwimSpeed());
    }

    @Override
    public int getFlySpeed() {
        return 50;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
