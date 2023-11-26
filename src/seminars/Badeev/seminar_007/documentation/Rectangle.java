package seminars.Badeev.seminar_007.documentation;

/**
 * Класс, представляющий прямоугольник
 */
public class Rectangle implements Shape{
    private int wight;
    private int heigth;

    /**
     * Создаёт новый прямоугольник с заданными шириной и высотой
     * @param wight Ширина прямоугольника
     * @param heigth Высота прямоугольника
     */
    public Rectangle(int wight, int heigth) {
        this.wight = wight;
        this.heigth = heigth;
    }

    /**
     * Вычисляет площадь прямоугольника
     * @return Площадь прямоугольника
     */
    public double getArea() {
        return wight * heigth;
    }

    // Геттеры для ширины и высоты прямоугольника
    // Сеттеры для ширины и высоты прямоугольника
}
