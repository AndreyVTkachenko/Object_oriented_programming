package seminars.Moiseev.seminar_006.DIP;

public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}
