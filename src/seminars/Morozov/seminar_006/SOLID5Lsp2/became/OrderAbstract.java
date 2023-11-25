package seminars.Morozov.seminar_006.SOLID5Lsp2.became;

public abstract class OrderAbstract {

    protected int price;
    protected int qnt;

    public OrderAbstract(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }

    public abstract int getAmount();

    @Override
    public String toString() {
        return String.format("Order: Цена = %d, Количество = %d", price, qnt);
    }
}
