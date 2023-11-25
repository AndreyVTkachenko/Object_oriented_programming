package seminars.Morozov.seminar_006.SOLID1Srp1.bacame;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        DrawSquare drawSquare = new DrawSquare(side);

        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        drawSquare.draw();

        drawSquare.zoom(2.5f);
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        drawSquare.draw();
    }
}
