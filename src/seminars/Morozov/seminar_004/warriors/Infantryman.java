package seminars.Morozov.seminar_004.warriors;

import seminars.Morozov.seminar_004.weapons.melee_weapon.Melee;

public class Infantryman extends Warrior<Melee>{
    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
