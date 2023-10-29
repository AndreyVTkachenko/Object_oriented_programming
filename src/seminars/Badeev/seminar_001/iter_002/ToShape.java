package seminars.Badeev.seminar_001.iter_002;

// TODO + инкапсуляция (скрыли переменные)

public class ToShape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showDim() {
        System.out.printf("Ширина %f, Высота %f ", width, height);
    }
}

class Triangle extends ToShape {
    String style;
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.printf("Треугольник: %s ", style);
    }
}

