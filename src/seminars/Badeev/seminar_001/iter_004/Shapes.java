package seminars.Badeev.seminar_001.iter_004;

// TODO + инкапсуляция (скрыли переменные)
//      + добавляем конструктор (теперь класс Triangle инициализирует только style)
//      + конструкторы по умолчанию (добавляем конструкторы для ToShape и Triangle)

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1.1, 2.2, "blue");
        Triangle t2 = new Triangle(2.1, 2.3, "green");

        ToShape t3 = new ToShape(1.1, 1.2);

        Triangle t4 = new Triangle(1.5, "red");

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
