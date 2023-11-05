package seminars.Badeev.seminar_002.task001;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        System.out.println("реализация Test1");
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test1.getNext());
        }
        System.out.println("Сброс");
        test1.reset();
        System.out.println("Начальное значение 100");
        test1.setNum(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test1.getNext());
        }

        System.out.println();

        System.out.println("реализация Test2");
        Test2 test2 = new Test2();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test2.getNext());
        }
        System.out.println("Сброс");
        test2.reset();
        System.out.println("Начальное значение 100");
        test2.setNum(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + test2.getNext());
        }
    }
}
