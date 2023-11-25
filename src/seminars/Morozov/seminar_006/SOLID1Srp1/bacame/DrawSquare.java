package seminars.Morozov.seminar_006.SOLID1Srp1.bacame;

public class DrawSquare {

    private int side;

    public DrawSquare(int side) {
        this.side = side;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < side - 2; i++) {
            System.out.print("* ");
            for (int j = 1; j < side - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("* ");
        }
    }

    public void zoom(float zoom) {
        side = (int) (side * zoom);
    }
}
