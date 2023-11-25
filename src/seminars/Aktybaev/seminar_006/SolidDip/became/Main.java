package seminars.Aktybaev.seminar_006.SolidDip.became;

public class Main {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}
