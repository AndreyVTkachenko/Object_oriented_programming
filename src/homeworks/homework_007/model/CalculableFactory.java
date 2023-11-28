package homeworks.homework_007.model;

import homeworks.homework_007.presenter.ICalculableFactory;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(double primaryArg) {
        return new Calculator(primaryArg);
    }
}
