package seminars.Aktybaev.seminar_007.creational.builder.builder;

public abstract class BusinessCardBuilder {
    private BusinessCard card;

    public BusinessCardBuilder() {
        createCard();
    }

    void createCard(){
        card = new BusinessCard();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildSize();

    public BusinessCardBuilder setColor1(String color1) {
        card.setColor1(color1);
        return this;
    }

    public BusinessCardBuilder setColor2(String color2) {
        card.setColor2(color2);
        return this;
    }

    BusinessCard getCard() {
        return card;
    }

    public BusinessCard build() {
        buildName();
        buildPrice();
        buildSize();
        return getCard();
    }
}
