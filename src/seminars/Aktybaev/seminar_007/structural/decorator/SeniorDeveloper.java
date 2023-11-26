package seminars.Aktybaev.seminar_007.structural.decorator;

public class SeniorDeveloper extends DeveloperDecorator {
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    String sendReport(){
        return "Пишу отчёт по проекту.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + sendReport();
    }
}
