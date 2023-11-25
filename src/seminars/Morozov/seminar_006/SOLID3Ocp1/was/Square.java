package seminars.Morozov.seminar_006.SOLID3Ocp1.was;

public class Square  implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
