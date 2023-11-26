package seminars.Moiseev.seminar_007.adapter;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);


        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb

        MeteoSensor st500_1 = new AdapterST500Info(new ST500Info().getData());
        meteoDb.save(st500_1);
    }
}
