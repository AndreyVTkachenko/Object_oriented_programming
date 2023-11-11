package seminars.Morozov.seminar_004.weapons.melee_weapon;

public class Axe implements Melee{

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Axe: %s", damage());
    }
}
