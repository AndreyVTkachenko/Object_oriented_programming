package seminars.Badeev.seminar_004.task_004;

import static seminars.Badeev.seminar_004.task_004.UseTest.test;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> ga = new Gen<A>(a);
        Gen<B> gb = new Gen<B>(b);
        Gen<C> gc = new Gen<C>(c);
        Gen<D> gd = new Gen<D>(d);

        test(ga);
        test(gb);
        test(gc);
//        test(gd); не сработает т.к. нет наследования от A или B и C
    }
}
