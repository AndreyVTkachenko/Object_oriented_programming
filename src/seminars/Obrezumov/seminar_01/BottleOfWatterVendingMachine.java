package seminars.Obrezumov.seminar_01;

import java.util.List;

public class BottleOfWatterVendingMachine implements VendingMachine{
    private final List<Product> productList;
    private int money;

    public BottleOfWatterVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public BottleOfWatter getProduct(String name, int volume) {
         for (Product product : productList) {
             if (product instanceof BottleOfWatter) {
                 if (product.getName().equals(name) && ((BottleOfWatter) product).getVolume() == volume) {
                     return (BottleOfWatter) product;
                 }
             }
         }
         return null;
    }

    public void addBottleOfWater(BottleOfWatter bottleOfWatter){
        this.productList.add(new BottleOfWatter());
    }
}
