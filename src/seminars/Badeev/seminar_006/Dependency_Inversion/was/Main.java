package seminars.Badeev.seminar_006.Dependency_Inversion.was;

public class Main {
    public static void main(String[] args) {
        AnimalOwner dogOwner = new AnimalOwner();
        dogOwner.makeDogBark(); // вывод: Dog barks.
    }
}
