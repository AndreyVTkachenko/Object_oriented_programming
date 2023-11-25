package seminars.Morozov.seminar_006.SOLID2Srp2.became;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson implements Preserved {

    Order order;

    public SaveToJson(Order order) {
        this.order = order;
    }

    @Override
    public void save() {
        String fileName = "C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Введение в ООП\\" +
                "Object_oriented_programming\\src\\seminars\\Morozov\\seminar_006\\SOLID2Srp2\\became\\order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
