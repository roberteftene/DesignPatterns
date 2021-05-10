package gof.dp.structural.decorator;

public class ShieldDecorator extends AbstracHeroesDecorator {

    int shieldPower;

    public ShieldDecorator(SuperHeroCharacter decoratedObject, int shieldPower) {
        super(decoratedObject);
        this.shieldPower = shieldPower;
    }

    @Override
    public void takeAHit(int points) {
        int realPoints = points - shieldPower;
        if(realPoints < 0) {
            realPoints = 0;
        } else {
            this.decoratedObj.takeAHit(realPoints);
        }
    }
}
