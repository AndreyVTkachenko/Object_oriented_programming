package seminars.Obrezumov.seminar_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("a", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("b", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("c", 3, 3);
        BottleOfWatter b4 = new BottleOfWatter("d", 10, 10);
        BottleOfWatter b5 = new BottleOfWatter("e", 20, 20);
        BottleOfWatter b6 = new BottleOfWatter("f", 30, 30);

        BottleOfWatterVendingMachine vendingMachine = new BottleOfWatterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        vendingMachine.addBottleOfWater(b6);
    }
}

