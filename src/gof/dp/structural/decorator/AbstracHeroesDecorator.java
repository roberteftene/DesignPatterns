package gof.dp.structural.decorator;

public abstract class AbstracHeroesDecorator extends SuperHeroCharacter {

    SuperHeroCharacter decoratedObj;


    public AbstracHeroesDecorator(SuperHeroCharacter decoratedObject) {
        super(decoratedObject.name, decoratedObject.power);
        this.decoratedObj = decoratedObject;
    }

    @Override
    public void move() {
        this.decoratedObj.move();
    }

    @Override
    public void crouch() {
        this.decoratedObj.crouch();
    }

    @Override
    public void takeAHit(int points) {
        this.decoratedObj.takeAHit(points);
    }

    @Override
    public void heal(int points) {
        this.decoratedObj.heal(points);
    }
}
