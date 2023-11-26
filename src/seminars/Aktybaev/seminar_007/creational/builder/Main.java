package seminars.Aktybaev.seminar_007.creational.builder;

import seminars.Aktybaev.seminar_007.creational.builder.builder.BusinessCard;
import seminars.Aktybaev.seminar_007.creational.builder.builder.BusinessCardBuilder;
import seminars.Aktybaev.seminar_007.creational.builder.builder.LargeBusinessCardBuilder;
import seminars.Aktybaev.seminar_007.creational.builder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder1 = new SmallBusinessCardBuilder();
        BusinessCard card1 = builder1.build();
        System.out.println(card1);

        BusinessCardBuilder builder2 = new LargeBusinessCardBuilder();
        BusinessCard card2 = builder2.build();
        System.out.println(card2);

        BusinessCardBuilder builder3 = new SmallBusinessCardBuilder();
        BusinessCard card3 = builder3
                .setColor1("красный")
                .setColor2("белый")
                .build();
        System.out.println(card3);
    }
}
