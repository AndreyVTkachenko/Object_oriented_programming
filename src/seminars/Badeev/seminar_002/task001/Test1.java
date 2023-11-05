package seminars.Badeev.seminar_002.task001;

public class Test1 implements Numeric {

    int start;
    int val;

    public Test1() {
        this.start = 0;
        this.val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setNum(int x) {
        start = x;
        val = x;
    }

    public void promo() {
        System.out.println("Hello!");
    }
}
