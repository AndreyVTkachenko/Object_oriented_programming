package seminars.Badeev.seminar_004.task_006;

public class MyClass<T> {

    private T val;

    public MyClass() {
        // Пустой конструктор
    }

    public MyClass(T defaultValue) {
        this.val = defaultValue;
    }

    public void setValue(T value) {
        this.val = value;
    }

    public T getValue() {
        return val;
    }
}
