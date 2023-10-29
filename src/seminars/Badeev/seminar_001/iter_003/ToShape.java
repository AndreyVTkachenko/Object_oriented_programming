package seminars.Badeev.seminar_001.iter_003;

// TODO + инкапсуляция (скрыли переменные)
//      + добавляем конструктор (теперь класс Triangle инициализирует только style)

public class ToShape {
    private double width;
    private double height;

    public ToShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

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

    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.printf("Треугольник: %s ", style);
    }
}

