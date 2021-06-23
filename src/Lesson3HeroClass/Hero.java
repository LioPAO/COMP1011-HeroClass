package Lesson3HeroClass;
/**
 * Creating a Hero Class which creates an object of type Hero
 * Heroes are created with a name given by the user
 * The Hero's abilities (Strength, Speed, Health) are randomly generated upon creation.
 * A hero has the ability to fight and cause damage.
 * During a fight a hit attempt occurs 20% of the time
 * If true, the damage is calculated by multiplying the Hero's strength by a random number from 1-6
 * Once a hit is done, the damage is displayed else nothing.
 * Finally the Hero's ability stats can be shown using the show method.
 */

public class Hero {

    //ATTRIBUTES -----------------------------------------------
    private int strength;
    private int speed;
    private int health;
    private String name;

    //CONSTRUCTOR-----------------------------------------------
    public Hero(String name){
        this.name = name;
        generateAbilitiies();
    }

    //GETTERS--------------------------------------------
    public int getStrength() {
        return this.strength;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getHealth() {
        return this.health;
    }
    public String getName() {
        return this.name;
    }

    //PRIVATE METHODS ------------------------------------------
    private void generateAbilitiies(){
        this.strength = (int) ((Math.random() * 100) + 1);
        this.speed = (int) ((Math.random() * 100) + 1);
        this.health = (int) ((Math.random() * 100) + 1);
    }

    //PUBLIC METHODS -------------------------------------------
    public void fight(){
       if( hitAttempt()) {
           System.out.println(this.name + " has caused " + hitDamage() + " damage.");
       }else {
           System.out.println(this.name + " has not hit.");
       }
    }
    public boolean hitAttempt(){
        int random = (int) (Math.random() * 101);
        return (random < 21);
    }
    public int hitDamage(){
        int random = (int )(Math.random()*6)+1;
        return random * this.strength;
    }
    public void show(){
        System.out.println("-----------------");
        System.out.println(this.name + "'s Abilities");
        System.out.println("Strength : " + this.strength);
        System.out.println("Speed : " + this.speed);
        System.out.println("Health : " + this.health);
        System.out.println("-----------------");
    }

}
