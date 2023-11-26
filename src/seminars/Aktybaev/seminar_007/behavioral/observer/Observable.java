package seminars.Aktybaev.seminar_007.behavioral.observer;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
