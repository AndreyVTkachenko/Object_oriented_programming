package seminars.Badeev.seminar_004.task_003;

public class Numeric<T extends Number> {

    T num;

    public Numeric(T n) {
        num = n;
    }

    public double reciprocal() {
        return 1 / num.doubleValue();
    }

    public double fraction() {
        return num.doubleValue() - num.intValue();
    }
}
