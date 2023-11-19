package seminars.Badeev.seminar_006.Open_Closed.became;

public class Main {
    public static void main(String[] args) {
        AnimalSoundManager soundManager = new AnimalSoundManager();
        IMakeSound dog = new Dog("Buddy");
        IMakeSound cat = new Cat("Whiskers");
        IMakeSound bird = new Bird("Polly");

        soundManager.playAnimalSound(dog); // вывод "Woof!"
        soundManager.playAnimalSound(cat); // вывод "Meow!"
        soundManager.playAnimalSound(bird); // вывод "Chirp!"
    }
}
