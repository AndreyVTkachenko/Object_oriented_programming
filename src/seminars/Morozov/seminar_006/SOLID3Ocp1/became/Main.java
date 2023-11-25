package seminars.Morozov.seminar_006.SOLID3Ocp1.became;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.area();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
