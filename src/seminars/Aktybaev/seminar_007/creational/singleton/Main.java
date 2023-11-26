package seminars.Aktybaev.seminar_007.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SimpleResource simpleResource = SimpleResource.getSingleResourse();

        System.out.println(simpleResource);
    }
}
