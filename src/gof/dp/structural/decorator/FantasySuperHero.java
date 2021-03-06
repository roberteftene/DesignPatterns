package gof.dp.structural.decorator;

public class FantasySuperHero extends SuperHeroCharacter {

    Boolean canFly;

    public FantasySuperHero(String name, int power, boolean canFly) {
        super(name, power);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if(this.canFly) {
            System.out.println("Is flying");
        } else {
            System.out.println("Is moving fast");
        }
    }

    @Override
    public void crouch() {
        if(this.canFly) {
            System.out.println("Not able to crouch");
        } else {
            System.out.println("Is crouching");
        }
    }

    @Override
    public void takeAHit(int points) {
        System.out.println(String.format("%s took a hit of %d points",this.name,points));
        this.power -= points;
    }

    @Override
    public void heal(int points) {
        System.out.println(String.format("%s is healing %d points", this.name,points));
        this.power += points;
    }
}
