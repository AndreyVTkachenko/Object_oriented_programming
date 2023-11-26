package seminars.Moiseev.seminar_007.decorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Сыр";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
