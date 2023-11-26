package seminars.Badeev.seminar_007.patterns.builder;

public class Main {
    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.setBrand("Toyota")
                            .setModel("Camry")
                            .setYear(2022)
                            .setColor("Red")
                            .build();

        System.out.println(car);

        CarBuilder carBuilder1 = new CarBuilder();
        Car car1 = carBuilder1.setBrand("Toyota")
                .setModel("Corolla")
                .setYear(2022)
                .build();

        System.out.println("Car 1: " + car1);

        CarBuilder carBuilder2 = new CarBuilder();
        Car car2 = carBuilder2.setBrand("Honda")
                .setModel("Accord")
                .setYear(2023)
                .build();

        System.out.println("Car 2: " + car2);
    }
}
