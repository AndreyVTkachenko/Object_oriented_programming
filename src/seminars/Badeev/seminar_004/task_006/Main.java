package seminars.Badeev.seminar_004.task_006;

public class Main {
    public static void main(String[] args) {

        // Создаём экземпляр класса MyClass с типом Integer
        MyClass<Integer> myInt = new MyClass<>();
        myInt.setValue(10);
        System.out.println(myInt.getValue()); // Выведет 10

        // Создаём экземпляр класса MyClass с типом String и передаём значение
        MyClass<String> myString = new MyClass<>("Hello");
        System.out.println(myString.getValue()); // Выведет Hello
    }
}
