package seminars.Morozov.seminar_007.DecoratorFactory.became;

public class LogCalculator implements Calculable{

    private Calculable calculable;
    private Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Calculable primary arg: " + calculable.getResult());
    }


    @Override
    public Calculable sum(int arg) {
        logger.writeLog("Sum whit args: " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.writeLog("Multi whit args: " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        int result = calculable.getResult();
        logger.writeLog("Result: " + result);
        return result;
    }
}
