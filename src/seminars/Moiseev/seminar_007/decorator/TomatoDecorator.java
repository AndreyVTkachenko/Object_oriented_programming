package seminars.Moiseev.seminar_007.decorator;

public class TomatoDecorator extends PizzaDecorator{

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Помидор";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30;
    }
}
