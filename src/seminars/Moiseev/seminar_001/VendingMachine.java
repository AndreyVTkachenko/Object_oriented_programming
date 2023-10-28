package seminars.Moiseev.seminar_001;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, double volume);
}
