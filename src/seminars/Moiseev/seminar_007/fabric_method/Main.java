package seminars.Moiseev.seminar_007.fabric_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<ItemGeneration> generators = new ArrayList<>();
        generators.add(new GoldGeneration());
        generators.add(new GoldGeneration());
        generators.add(new GoldGeneration());
        generators.add(new GemGeneration());
        generators.add(new GemGeneration());
        generators.add(new RubyGeneration());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 25; i++) {
            IGameItem item = generators.get(Integer.parseInt(String.valueOf(Math.abs(random.nextInt() % generators.size())))).createItem();
            item.open();
        }
    }
}
