package seminars.Badeev.seminar_001.iter_002;

// TODO + инкапсуляция (скрыли переменные)

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setHeight(1.5);
        t1.setWidth(2.1);
        t1.style = "black";

        t2.setHeight(1.3);
        t2.setWidth(2.5);
        t2.style = "white";

        System.out.println("Информация о t1");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь " + t1.area());

        System.out.println("Информация о t2");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь " + t2.area());
    }
}
