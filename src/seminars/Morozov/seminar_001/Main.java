package seminars.Morozov.seminar_001;

public class Main {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Product("Alpen Gold", 10))
                .addProduct(new Product("Apple", 30))
                .addProduct(new Product("Coca cola", 15))
                .addProduct(new Product("Pepsi cola", 16))
                .addProduct(new Chocolate("Milka", 12, "dark", "with nuts", 100))
                .addProduct(new Cheese("Lamber", 50, "solid", 200));

        System.out.println(apparat);

        System.out.println("_________________________________________________________________________________________");

        Product product = apparat.findProduct("Apple");
        System.out.println(product);

        System.out.println("_________________________________________________________________________________________");

        Product saleProduct = apparat.saleProduct("Pepsi cola");
        System.out.println(saleProduct);
//        System.out.println("Осталось денег: ");
//        System.out.println(apparat.getCash());
        System.out.println(apparat);
    }
}
