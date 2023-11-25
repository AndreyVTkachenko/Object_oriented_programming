package seminars.Aktybaev.seminar_006.SolidLsp2.was;

public class FactoryOrder {
    public Order create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}
