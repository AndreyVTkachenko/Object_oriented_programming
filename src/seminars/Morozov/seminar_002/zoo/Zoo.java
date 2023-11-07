package seminars.Morozov.seminar_002.zoo;

import seminars.Morozov.seminar_002.Radio;
import seminars.Morozov.seminar_002.animals.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> zoo = new ArrayList<>();
    private Radio radio = new Radio();

    public Zoo addAnimal(Animal someAnimal) {
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("В зоопарке:\n");
        for (Animal animal : zoo) {
            stringBuilder.append(animal).append("\n");
        }
        return stringBuilder.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>();
        for (Animal animal : zoo) {
            result.add(animal);
        }
        result.add(radio);
        return result;
    }

    public String getSound() {
        StringBuilder stringBuilder = new StringBuilder("Звуки зоопарка:\n");
        for (Soundable soundable : getSoundable()) {
            stringBuilder.append(soundable.sound()).append("\n");
        }
        return stringBuilder.toString();
    }

    public List<RunSpeed> runners() {
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof RunSpeed) {
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunnerChampion() {
        List<RunSpeed> runners = runners();
        RunSpeed champion = runners.get(0);
        for (RunSpeed runner : runners) {
            if (champion.getRunSpeed() < runner.getRunSpeed()) {
                champion = runner;
            }
        }
        return champion;
    }

    public List<FlySpeed> flyers() {
        List<FlySpeed> flyers = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof FlySpeed) {
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }

    public FlySpeed getFlyerChampion() {
        List<FlySpeed> flyers = flyers();
        FlySpeed champion = flyers.get(0);
        for (FlySpeed flyer : flyers) {
            if (champion.getFlySpeed() < flyer.getFlySpeed()) {
                champion = flyer;
            }
        }
        return champion;
    }

    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof SwimSpeed) {
                swimmers.add((SwimSpeed) animal);
            }
        }
        return swimmers;
    }

    public SwimSpeed getSwimmerChampion() {
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champion = swimmers.get(0);
        for (SwimSpeed swimmer : swimmers) {
            if (champion.getSwimSpeed() < swimmer.getSwimSpeed()) {
                champion = swimmer;
            }
        }
        return champion;
    }
}
