package gof.dp.structural.adapter;

import gof.dp.structural.adapter.classes.Adapter;
import gof.dp.structural.adapter.classes.LaserPrinterInterface;
import gof.dp.structural.adapter.objects.Adaptor;
import gof.dp.structural.adapter.objects.FantasySuperHero;
import gof.dp.structural.adapter.objects.SuperHeroCharacter;
import gof.dp.structural.adapter.objects.externalframework.DisneyActions;
import gof.dp.structural.adapter.objects.externalframework.DonaldDuck;

import java.util.ArrayList;

public class TestAdapters {

    public static void main(String[] args) {
        //Classes
        System.out.println("Class adapter example");
        LaserPrinterInterface laser = new Adapter();
        laser.laserPrint(new String[] {"This","is","a","test"});
        laser.cancelPrint();

        //Objects
        //simulate the game by using the existing characters framework
        SuperHeroCharacter fantasyHeroName =
                new FantasySuperHero("BlueDragon",1000,true);

        fantasyHeroName.move();
        fantasyHeroName.takeAHit(500);
        fantasyHeroName.heal(200);

        //use a Disney character as a SuperHeroCharacter one
        DisneyActions donald = new DonaldDuck(500);
        donald.changeLocation(100,500);
        donald.isWounded(100);
        donald.isHealing(50);

        ArrayList<SuperHeroCharacter> gameHeroes = new ArrayList<>();
        gameHeroes.add(fantasyHeroName);

        Adaptor donaldAdapter = new Adaptor(donald);
        gameHeroes.add(donaldAdapter);

        System.out.println("-------------------------------");
        gameHeroes.forEach(hero -> {
            hero.crouch();
            hero.takeAHit(50);
            hero.heal(50);
        });

    }
}
