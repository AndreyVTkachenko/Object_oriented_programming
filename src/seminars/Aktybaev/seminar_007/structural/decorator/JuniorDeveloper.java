package seminars.Aktybaev.seminar_007.structural.decorator;

public class JuniorDeveloper implements Developer{
    @Override
    public String makeJob() {
        return writeCode();
    }

    private String writeCode() {
        return "Пишу код.";
    }
}
