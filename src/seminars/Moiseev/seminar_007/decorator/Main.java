package seminars.Moiseev.seminar_007.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaCheese = new PizzaDough();
        System.out.println(pizzaCheese.getDescription() + ": " + pizzaCheese.getCost() + " рублей");

        Pizza pizzaCheese1 = new CheeseDecorator(new PizzaDough());
        System.out.println(pizzaCheese1.getDescription() + ": " + pizzaCheese1.getCost() + " рублей");

        Pizza pizzaCheese2 = new CheeseDecorator(new CheeseDecorator(new PizzaDough()));
        System.out.println(pizzaCheese2.getDescription() + ": " + pizzaCheese2.getCost() + " рублей");

        Pizza pizzaTomatoCheese = new TomatoDecorator(new CheeseDecorator(new PizzaDough()));
        System.out.println(pizzaTomatoCheese.getDescription() + ": " + pizzaTomatoCheese.getCost() + " рублей");

        Pizza pizzaSausageTomatoCheese = new SausageDecorator(new TomatoDecorator(new CheeseDecorator(new PizzaDough())));
        System.out.println(pizzaSausageTomatoCheese.getDescription() + ": " + pizzaSausageTomatoCheese.getCost() + " рублей");
    }
}
