package seminars.Badeev.seminar_002.task001;

public class Test2 implements Numeric {

    int start;
    int val;

    public Test2() {
        this.start = 0;
        this.val = 0;
    }

    public int getNext() {
        val += 20;
        return val;
    }

    public void reset() {
        start = 10;
        val = 10;
    }

    public void setNum(int x) {
        start = x;
        val = x;
    }

    public void promo() {
        System.out.println("Hello!");
    }
}

