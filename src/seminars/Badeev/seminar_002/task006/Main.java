package seminars.Badeev.seminar_002.task006;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.start();
        engine.stop();

        Car car = new Car(engine);
        car.startCar();
        car.stopCar();
    }
}
