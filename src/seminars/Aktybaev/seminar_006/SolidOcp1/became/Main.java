package seminars.Aktybaev.seminar_006.SolidOcp1.became;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.addShape(new RightTriangle(2, 3));
        canvas.addShape(new Square(4));

        System.out.printf("Сумма площадей фигур равна %f \n", canvas.getArea());
    }
}
