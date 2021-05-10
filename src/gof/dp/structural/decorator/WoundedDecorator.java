package gof.dp.structural.decorator;

public class WoundedDecorator extends AbstracHeroesDecorator {

    public WoundedDecorator(SuperHeroCharacter decoratedObject) {
        super(decoratedObject);
    }

    @Override
    public void move() {
        System.out.println("The hero is barely moving because is wounded");
    }
}
