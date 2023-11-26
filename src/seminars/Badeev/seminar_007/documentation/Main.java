package seminars.Badeev.seminar_007.documentation;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        double sumAreas = GeometryUtils.sumAreas(rectangle, circle);

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь окружности: " + circle.getArea());
        System.out.println("Сумма площадей: " + sumAreas);
    }
}
