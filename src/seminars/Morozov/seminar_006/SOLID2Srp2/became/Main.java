package seminars.Morozov.seminar_006.SOLID2Srp2.became;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ: ");
        Order order = new FactoryCreator().inputFromConsole();
        new SaveToJson(order).save();
    }
}
