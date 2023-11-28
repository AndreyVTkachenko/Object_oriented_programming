package homeworks.homework_007.presenter;

import homeworks.homework_007.model.Calculable;

public interface ICalculableFactory {
    Calculable create(double primaryArg);
}
