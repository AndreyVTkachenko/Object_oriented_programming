package seminars.Morozov.seminar_004;

import seminars.Morozov.seminar_004.warriors.Archer;
import seminars.Morozov.seminar_004.warriors.Infantryman;
import seminars.Morozov.seminar_004.warriors.Warrior;
import seminars.Morozov.seminar_004.weapons.melee_weapon.Axe;
import seminars.Morozov.seminar_004.weapons.melee_weapon.Sword;
import seminars.Morozov.seminar_004.weapons.ranged_weapon.Bow;
import seminars.Morozov.seminar_004.weapons.ranged_weapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("Bobin", 150, new Axe()));

        Team<Archer> team2 = new Team<>();
        team2.add(new Archer("Gobin", 100, new CrossBow()));
        team2.add(new Archer("Lobin", 100, new Bow()));

        Team<Infantryman> team3 = new Team<>();
        team3.add(new Infantryman("Fobin", 150, new Sword()));

        System.out.println(team1);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(team2);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(team3);
        System.out.println("_________________________________________________________________________________________");
        System.out.println("_________________________________________________________________________________________");

        Warrior w1 = new Infantryman("Bobin", 150, new Axe());
        Warrior w2 = new Archer("Robin", 100, new Bow());

        Battle battle1 = new Battle(w1, w2);
        battle1.fight();

    }
}
