package seminars.Morozov.seminar_004.warriors;

import seminars.Morozov.seminar_004.weapons.ranged_weapon.Ranged;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public int distance() {
        return (super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
