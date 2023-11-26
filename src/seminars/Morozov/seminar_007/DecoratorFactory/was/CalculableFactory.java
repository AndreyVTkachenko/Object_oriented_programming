package seminars.Morozov.seminar_007.DecoratorFactory.was;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
