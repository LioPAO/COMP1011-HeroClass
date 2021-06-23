package Lesson3HeroClass;

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

    //PRIVATE METHODS ------------------------------------------
    private void generateAbilitiies(){
        this.strength = (int) ((Math.random() * 100) + 1);
        this.speed = (int) ((Math.random() * 100) + 1);
        this.health = (int) ((Math.random() * 100) + 1);
    }

    //PUBLIC METHODS -------------------------------------------
    public void fight(){
       if( hitAttempt()) {
           System.out.println(this.name + " has received " + hitDamge() + " damage.");
       }
        System.out.println(this.name + " has received " + "0 damage.");
    }
    public boolean hitAttempt(){
        int random = (int) (Math.random() * 101);
        return (random < 21);
    }
    public int hitDamge(){
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
