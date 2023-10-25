package lessons.lesson_005.Ex001Calc;

public class Program {
    public static void main(String[] args) {
//        var m = new SumModel();
//        var v = new View();
//        Presenter p = new Presenter(m, v);
//        p.buttonClick();

        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
