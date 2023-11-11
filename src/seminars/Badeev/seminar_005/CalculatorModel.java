package seminars.Badeev.seminar_005;

public class CalculatorModel {
    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            // Обработка деления на ноль. Это исключение можно обработать в самом 'case "/"' класса CalculatorController
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public void multiplication(double num1, double num2) {
        result = num1 * num2;
    }

    public double getResult() {
        return result;
    }
}
