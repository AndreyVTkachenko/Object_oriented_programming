package seminars.Aktybaev.seminar_007.behavioral.chain;

public class SimpleNotifier extends Notifier{
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("пишем в логи: " + message);
    }
}
