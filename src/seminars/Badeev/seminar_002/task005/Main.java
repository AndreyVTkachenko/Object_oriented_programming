package seminars.Badeev.seminar_002.task005;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Администратор: " + test.getAdminId());
        System.out.println("Пользователь: " + test.getUserId());
        System.out.println(MyIf.getUniqueId());
    }
}
