package homeworks.homework_007;

import homeworks.homework_007.presenter.ICalculableFactory;
import homeworks.homework_007.presenter.Log;
import homeworks.homework_007.presenter.LogCalculableFactory;
import homeworks.homework_007.view.ConsoleInputReader;
import homeworks.homework_007.view.ConsoleOutputWriter;
import homeworks.homework_007.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory, new ConsoleInputReader(), new ConsoleOutputWriter());
        view.run();
    }
}

