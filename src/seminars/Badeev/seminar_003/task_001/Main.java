package seminars.Badeev.seminar_003.task_001;

public class Main {
    public static void main(String[] args) {

        Ivalue001 value001;
        value001 = () -> 98.6;
        System.out.println(value001.getValue());

        Ivalue002 value002 = (x) -> 100.0 / x;
        Ivalue002 value002_1 = (y) -> 24.0 * y - 5.5;
        System.out.println(value002.getValue(5.0));
        System.out.println(value002_1.getValue(8.0));

        Ivalue003 value003 = (m, n) -> {
            double result = 1.0;
            // реализация
            // реализация
            // реализация
            // реализация
            // реализация
            return result;
        };
    }
}
