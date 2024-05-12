package lessons.lesson_001.Ex007;

public class Healer extends BaseHero {

    private int healPower;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++Healer.number),
                Healer.r.nextInt(100, 200));
        this.healPower = Healer.r.nextInt(30, 50);
    }

    public void heal(BaseHero target) {
        System.out.printf("%s Исцелил %s на %d HP\n",
                this.name, target.name, this.healPower);
        target.healed(this.healPower);
    }

    @Override
    public String getInfo() {
        return String.format("%s  Heal Power: %d", super.getInfo(), this.healPower);
    }
}

