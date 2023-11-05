package seminars.Badeev.seminar_003.task_002;

public class Main {
    public static void main(String[] args) {
        ISomeTest<Integer> iSomeTest001 = (a,b) -> a > b;
        System.out.println(iSomeTest001.test(5, 6));

        ISomeTest<Double> iSomeTest002 = (a, b) -> a > b;
        System.out.println(iSomeTest002.test(6.0, 1.0));
    }
}
