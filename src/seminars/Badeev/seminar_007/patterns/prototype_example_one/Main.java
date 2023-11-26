package seminars.Badeev.seminar_007.patterns.prototype_example_one;

public class Main {
    public static void main(String[] args) {

        // Создаём оригинальные объекты
        Circle originalCircle = new Circle();
        Square originalSquare = new Square();

        try {
            // Клонируем оригинальные объекты
            Circle clonedCircle = (Circle) originalCircle.clone();
            Square clonedSquare = (Square) originalSquare.clone();

            // Проверим что объекты скопировались правильно
            System.out.println("Original Circle Type: " + originalCircle.getType());
            System.out.println("Cloned Circle Type: " + clonedCircle.getType());
            System.out.println("Original Square Type: " + originalSquare.getType());
            System.out.println("Cloned Square Type: " + clonedSquare.getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
