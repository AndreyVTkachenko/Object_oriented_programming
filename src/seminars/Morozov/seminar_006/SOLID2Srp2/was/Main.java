package seminars.Morozov.seminar_006.SOLID2Srp2.was;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ: ");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}
