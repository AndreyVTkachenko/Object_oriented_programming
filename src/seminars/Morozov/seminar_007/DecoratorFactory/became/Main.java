package seminars.Morozov.seminar_007.DecoratorFactory.became;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
