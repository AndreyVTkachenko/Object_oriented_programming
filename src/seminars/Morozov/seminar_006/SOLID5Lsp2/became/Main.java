package seminars.Morozov.seminar_006.SOLID5Lsp2.became;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(2, 3, false));
        calculator.add(creator.create(3, 1, false));
        calculator.add(creator.create(2, 2, true));

        for (OrderAbstract order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}
