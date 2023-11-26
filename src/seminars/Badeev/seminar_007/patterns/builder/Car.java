package seminars.Badeev.seminar_007.patterns.builder;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + " (" + year + "), color: " + color;
    }
}
