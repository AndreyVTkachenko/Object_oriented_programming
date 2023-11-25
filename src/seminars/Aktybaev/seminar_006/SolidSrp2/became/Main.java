package seminars.Aktybaev.seminar_006.SolidSrp2.became;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ: ");
        Order order = new Creator().inputFromConsole();
        new SaveToJson(order).save();
    }
}
