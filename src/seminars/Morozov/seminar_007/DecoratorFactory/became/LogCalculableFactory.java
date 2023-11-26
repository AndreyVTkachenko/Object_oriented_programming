package seminars.Morozov.seminar_007.DecoratorFactory.became;

public class LogCalculableFactory implements ICalculableFactory{

    private Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
