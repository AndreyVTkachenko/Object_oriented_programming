package seminars.Morozov.seminar_006.SOLID5Lsp2.was;

public class OrderBonus extends Order{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
