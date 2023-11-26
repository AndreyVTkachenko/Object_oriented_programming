package seminars.Aktybaev.seminar_007.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Developer developer1 = new JuniorDeveloper();
        System.out.println(developer1.makeJob());

        Developer developer2 = new MiddleDeveloper(developer1);
        System.out.println(developer2.makeJob());

        Developer developer3 = new SeniorDeveloper(developer2);
        System.out.println(developer3.makeJob());
    }
}
