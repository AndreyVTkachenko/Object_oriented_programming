package seminars.Badeev.seminar_004.task_003;

public class Main {
    public static void main(String[] args) {

        Numeric<Integer> obi = new Numeric<Integer>(5);

        System.out.println("Обратная величина " + obi.reciprocal());
        System.out.println("Дробная величина " + obi.fraction());

        Numeric<Double> obd = new Numeric<Double>(5.25);

        System.out.println("Обратная величина " + obd.reciprocal());
        System.out.println("Дробная величина " + obd.fraction());

        // Numeric<String> obstr = new Numeric<String>("str"); невозможно создать объект класса String
    }
}
