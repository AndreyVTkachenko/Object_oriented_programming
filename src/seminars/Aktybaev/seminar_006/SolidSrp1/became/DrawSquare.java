package seminars.Aktybaev.seminar_006.SolidSrp1.became;

public class DrawSquare {
    private int side;

    public DrawSquare(int side) {
        this.side = side;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < side - 2; i++) {
            System.out.print("*");
            for (int j = 1; j < side - 1; j++) {
                System.out.print("   ");
            }
            System.out.println("  *");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("*  ");
        }
    }
}
