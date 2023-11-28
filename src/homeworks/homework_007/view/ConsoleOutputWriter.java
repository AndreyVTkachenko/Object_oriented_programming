package homeworks.homework_007.view;

public class ConsoleOutputWriter implements OutputWriter {
    @Override
    public void writeOutput(String message) {
        System.out.println(message);
    }
}
