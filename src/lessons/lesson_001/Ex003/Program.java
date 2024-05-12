package lessons.lesson_001.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        a.setX(12);
        System.out.println(a.getX());
        System.out.println("______________________");

        Point2D a1 = new Point2D(0, 2);
        System.out.println(a1.getX());
        System.out.println(a1.getY());
        System.out.println("______________________");

        Point2D b = new Point2D(0);
        System.out.println(b);
        System.out.println("______________________");

        Point2D b2 = new Point2D(0, 10);
        System.out.println(b2);
        System.out.println("______________________");

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
