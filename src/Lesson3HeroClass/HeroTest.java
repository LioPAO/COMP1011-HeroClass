package Lesson3HeroClass;

import java.util.HashSet;

public class HeroTest {
    public static void main(String[] args) {
        Hero pao = new Hero("PAO");
        pao.show();
        pao.fight();
        Hero mao = new SuperHero("MAO");
        mao.show();
        mao.fight();
    }
}
