package seminars.Morozov.seminar_006.SOLID7Dip.became;

public class Main {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}
