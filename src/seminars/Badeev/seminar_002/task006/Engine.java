package seminars.Badeev.seminar_002.task006;

public class Engine implements EngineInterface{
    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }
}
