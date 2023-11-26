package seminars.Morozov.seminar_007.DecoratorFactory.became;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}
