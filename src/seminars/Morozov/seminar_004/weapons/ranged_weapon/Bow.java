package seminars.Morozov.seminar_004.weapons.ranged_weapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 8;
    }

    @Override
    public int distance() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Bow: %s", damage());
    }
}
