package seminars.Morozov.seminar_006.SOLID5Lsp2.became;

public class FactoryOrder {

    private int count = 0;

    // Каждый 3-й заказ - бонусный
    public OrderAbstract create(int price, int qnt, boolean isBonus) {
        if (isBonus){
            return new OrderBonus(price, qnt);
        }
        return new Order(price, qnt);
    }
}
