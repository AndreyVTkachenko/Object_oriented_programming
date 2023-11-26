package seminars.Badeev.seminar_007.documentation;

/**
 * Класс, представляющий окружность
 */
public class Circle implements Shape{
    private double radius;

    /**
     * Создаёт новую окружность с заданным радиусом
     * @param radius Радиус окружности
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь окружности
     * @return Площадь окружности
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Геттеры для радиуса окружности
    // Сеттеры для радиуса окружности
}
