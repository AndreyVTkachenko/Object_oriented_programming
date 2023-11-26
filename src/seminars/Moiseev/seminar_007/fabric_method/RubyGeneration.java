package seminars.Moiseev.seminar_007.fabric_method;

public class RubyGeneration extends ItemGeneration{
    @Override
    public IGameItem createItem() {
        return new RubyReward();
    }
}
