package seminars.Morozov.seminar_006.SOLID5Lsp2.was;

public class FactoryOrder {

    private int count = 0;

    // Каждый 3-й заказ - бонусный
    public Order create(int qnt, int price, boolean isBonus) {
        if (isBonus){
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}
