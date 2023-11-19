package seminars.Badeev.seminar_006.Open_Closed.was;

public class Main {
    public static void main(String[] args) {
        AnimalSoundManager soundManager = new AnimalSoundManager();
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        soundManager.playAnimalSound(dog); // вывод "Woof!"
        soundManager.playAnimalSound(cat); // вывод "Meow!"
    }
}
