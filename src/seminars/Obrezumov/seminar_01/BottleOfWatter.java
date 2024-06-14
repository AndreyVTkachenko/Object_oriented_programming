package seminars.Obrezumov.seminar_01;

public class BottleOfWatter extends Product{
    private int volume;

    public BottleOfWatter(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public BottleOfWatter() {
        super();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWatter{" + "volume=" + volume + ", name=" + getName() + '}';
    }
}
