package gof.dp.structural.adapter.objects;

import gof.dp.structural.adapter.objects.externalframework.DisneyActions;

public class Adaptor extends SuperHeroCharacter {

    DisneyActions disneyCharacter = null;

    public Adaptor(DisneyActions disneyCharacter) {
        super(disneyCharacter.getName(), disneyCharacter.getLifePoints());
        this.disneyCharacter = disneyCharacter;
    }

    @Override
    public void move() {
        this.disneyCharacter.changeLocation(0,0);
    }

    @Override
    public void crouch() {
        System.out.println(String.format("%s is crouching",this.disneyCharacter.getName()));
    }

    @Override
    public void takeAHit(int points) {
        this.disneyCharacter.isWounded(points);
    }

    @Override
    public void heal(int points) {
        this.disneyCharacter.isHealing(points);
    }
}
