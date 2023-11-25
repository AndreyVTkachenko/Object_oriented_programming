package seminars.Morozov.seminar_006.SOLID5Lsp2.became;

public class Order extends OrderAbstract{

    public Order(int price, int qnt) {
        super(price, qnt);
    }

    public int getAmount() {
        return super.price * super.qnt;
    }
}
