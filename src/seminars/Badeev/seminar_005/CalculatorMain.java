package seminars.Badeev.seminar_005;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view, model);

        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        controller.performOperation(operation, num1, num2);
    }
}
