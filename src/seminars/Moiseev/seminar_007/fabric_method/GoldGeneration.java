package seminars.Moiseev.seminar_007.fabric_method;

public class GoldGeneration extends ItemGeneration{
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
