package gof.dp.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        SuperHeroCharacter fantasy = new FantasySuperHero("BlueDragon",200,true);
        fantasy.move();
        fantasy.takeAHit(500);
        SuperHeroCharacter wounded =
                new WoundedDecorator(fantasy);
        wounded.move();
    }

}
