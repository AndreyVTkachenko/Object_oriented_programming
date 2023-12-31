package seminars.Morozov.seminar_004;

import seminars.Morozov.seminar_004.warriors.Archer;
import seminars.Morozov.seminar_004.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T>{
    private List<T> team = new ArrayList<>();

    public void add(T element) {
        team.add((element));
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T t: this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance() {
        int maxDistance = 0;
        for (T t: this) {
            if (!(t instanceof Archer)) {
                continue;
            }
            int currentDistance = ((Archer) t).distance();
            if (maxDistance < currentDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() {
        int teamAttack = 0;
        for (T t: this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t: this) {
            stringBuilder.append(t).append("\n");
        }
        stringBuilder.append(String.format("TeamAttack: %s ", getTeamAttack()));
        stringBuilder.append(String.format("TeamHealth: %s ", getTeamHealth()));
        stringBuilder.append(String.format("TeamRange: %s ", maxAttackDistance()));

        return stringBuilder.toString();
    }
}
