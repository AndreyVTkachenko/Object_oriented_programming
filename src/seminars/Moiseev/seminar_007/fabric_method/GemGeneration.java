package seminars.Moiseev.seminar_007.fabric_method;

public class GemGeneration extends ItemGeneration{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
