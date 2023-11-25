package seminars.Aktybaev.seminar_006.SolidSrp1.became;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(new Point(1,1), side);
        DrawSquare drawSquare = new DrawSquare(side * 2);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        drawSquare.draw();
    }
}
