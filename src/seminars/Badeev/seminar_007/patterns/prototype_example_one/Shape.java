package seminars.Badeev.seminar_007.patterns.prototype_example_one;

public abstract class Shape implements Cloneable{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
