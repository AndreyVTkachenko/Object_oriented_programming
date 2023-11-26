package seminars.Aktybaev.seminar_007.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(1);
        Notifier emailNotifier = new EmailNotifier(2);
        Notifier smsNotifier = new SMSNotifier(3);



        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.manage("Все в порядке", Priority.ROUTINE);
        simpleNotifier.manage("Что-то пошло не так", Priority.IMPORTANT);
        simpleNotifier.manage("Все плохо!", Priority.ASAP);
    }
}
