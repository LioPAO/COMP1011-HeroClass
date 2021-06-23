package Lesson3HeroClass;
import java.util.HashSet;

/**
 * Extends Hero class and contructs a new SuperHero object using same parametes from Hero class.
 * Generates 3 random Super powers from an array of powers
 * Assigns these 3 super powers as the SuperHero's superpwer
 * Overrides show method to also display the new super powers
 */

public class SuperHero extends Hero{

    //ATTRIBUTES -----------------------------------------------
    private String [] superPowers = new String[3];

    //CONSTRUCTOR-----------------------------------------------
    public SuperHero(String name) {
        super(name);
        generateRandomPowers();
    }

    //PUBLIC METHODS -------------------------------------------
    private void generateRandomPowers(){
        String [] powers ={"Super Speed","Super Strength","Body Armour","Flight","Fire Generation","Weather Control"};
        HashSet<String> set = new HashSet<>();
        while(set.size()!=3){
            int random = (int)(Math.random()*6);
            set.add(powers[random]);
        }
        int index = 0;
        for (String str: set) {
            superPowers[index] = str;
            index++;
        }
    }
    @Override
    public void show(){
        System.out.println("-----------------");
        System.out.println(getName() + "'s Abilities");
        System.out.println("Strength : " + getStrength());
        System.out.println("Speed : " + getSpeed());
        System.out.println("Health : " + getHealth());
        System.out.println(getName()     + "'s Super powers");
        for (int i=0; i<superPowers.length;i++) {
            System.out.println("Super Power No " + (i + 1) + " : " + superPowers[i]);
        }
        System.out.println("-----------------");

    }
}
