package seminars.Moiseev.seminar_007.decorator;

public class PizzaDough implements Pizza{
    @Override
    public String getDescription() {
        return "Тесто";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
