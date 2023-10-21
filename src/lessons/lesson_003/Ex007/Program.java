package lessons.lesson_003.Ex007;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода1"));
        latte.addComponent(new Water("вода1"));
        latte.addComponent(new Water("вода1"));
        latte.addComponent(new Water("вода2"));
        latte.addComponent(new Water("вода3"));
        latte.addComponent(new Water("вода4"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
