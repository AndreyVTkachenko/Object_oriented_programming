package seminars.Aktybaev.seminar_006.SolidOcp1.became;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double getArea(){
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }
}
