package seminars.Badeev.seminar_007.patterns.builder;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder setBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    public CarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    public CarBuilder setYear(int year) {
        car.setYear(year);
        return this;
    }

    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    public Car build() {
        return car;
    }
}
