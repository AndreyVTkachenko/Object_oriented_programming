package seminars.Moiseev.seminar_007.observer;

import java.util.Random;

public class JuniorDeveloper implements Observer{
    String name;

    public JuniorDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void receiverOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.println(String.format("JuniorDeveloper %s: Я принимаю предложение! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("JuniorDeveloper %s: Я не принимаю предложение! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
