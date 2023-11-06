package seminars.Badeev.seminar_004.task_002;

public class Main {
    public static void main(String[] args) {

        Gen<Integer, String> ob = new Gen<>(99, "Test");

        ob.showType();

        int v = ob.getOb1();

        System.out.println("значение ob.v: " + v);

        String str = ob.getOb2();

        System.out.println("значение ob.str: " + str);
    }
}
