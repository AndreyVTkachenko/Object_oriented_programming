package seminars.Morozov.seminar_006.SOLID4Lsp1.was;

public class ViewShape {
    private Rectangle rectangle;

    public ViewShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна: ");
        System.out.println(rectangle.getArea());
    }
}
