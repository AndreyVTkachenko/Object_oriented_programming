package seminars.Moiseev.seminar_007.decorator;

public class SausageDecorator extends PizzaDecorator{

    public SausageDecorator(Pizza pizza) {
        super(pizza);
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Колбаса";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 75;
    }
}
