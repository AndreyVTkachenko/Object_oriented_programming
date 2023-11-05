package seminars.Aktybaev.seminar_002.taxi;

public class Yandex extends Taxi{
    @Override
    public void drive(String address) {
        System.out.println("Яндекс-такси уже в пути!");
    }
}
