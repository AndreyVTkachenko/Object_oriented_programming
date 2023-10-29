package seminars.Badeev.seminar_001.super_and_this;

class A {
    int i;
}

class B extends A {
    int i;

    public B(int a, int b) {
        super.i = a;
        i = b;
    }

    public void show() {
        System.out.println("i (super)= " + super.i);
        System.out.println("i (this)= " + this.i);
    }

    public static class UserSuper {
        public static void main(String[] args) {
            B b = new B(1, 2);
            b.show();
        }
    }
}
