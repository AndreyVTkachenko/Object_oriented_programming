package seminars.Aktybaev.seminar_007.creational.builder.builder;

import java.util.Arrays;

public class BusinessCard {
    private String name;
    private int[] size;
    private double price;
    private String color1;
    private String color2;

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", size=" + Arrays.toString(size) +
                ", price=" + price +
                ", color1='" + color1 + '\'' +
                ", color2='" + color2 + '\'' +
                '}';
    }
}
