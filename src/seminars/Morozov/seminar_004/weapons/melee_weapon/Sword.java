package seminars.Morozov.seminar_004.weapons.melee_weapon;

public class Sword implements Melee{
    @Override
    public int damage() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Sword: %s", damage());
    }
}
