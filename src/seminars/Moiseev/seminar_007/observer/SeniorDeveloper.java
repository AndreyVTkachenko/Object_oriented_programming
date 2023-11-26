package seminars.Moiseev.seminar_007.observer;

public class SeniorDeveloper implements Observer{
    String name;

    public SeniorDeveloper(String name) {
        this.name = name;
    }


    @Override
    public void receiverOffer(String nameCompany, int salary) {
        if (salary < 125) {
            System.out.println(String.format("SeniorDeveloper %s: Я жду лучшей работы! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("SeniorDeveloper %s: Хорошо! Я готов к этой работе! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
