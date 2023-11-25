package seminars.Aktybaev.seminar_006.SolidSrp1.was;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        square.draw();
    }
}
