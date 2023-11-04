package seminars.Aktybaev.seminar_001.product;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    @Override
    public String toString() {
        return "name: " + name + ", price: " + price;
    }
}
