package seminars.Aktybaev.seminar_001;

import seminars.Aktybaev.seminar_001.product.Bottle;
import seminars.Aktybaev.seminar_001.product.Product;
import seminars.Aktybaev.seminar_001.vending_machine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("Twix", 100);
        Product product2 = new Bottle("Coca-cola", 120, 1.5);
        Product product3 = new Product("Bounty", 90);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);
    }
}
