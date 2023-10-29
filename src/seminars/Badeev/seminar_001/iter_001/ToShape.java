package seminars.Badeev.seminar_001.iter_001;

// TODO самый простой вариант

public class ToShape {
    double width;
    double height;

    public void showDim() {
        System.out.printf("Ширина %f, Высота %f ", width, height);
    }
}

class Triangle extends ToShape {
    String style;
    public double area() {
        return width * height / 2;
    }

    public void showStyle() {
        System.out.printf("Треугольник: %s ", style);
    }
}

