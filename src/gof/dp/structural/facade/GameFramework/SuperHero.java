package gof.dp.structural.facade.GameFramework;

public class SuperHero {

    String name;
    Helmet helmet;
    SuperPower superPower;

    public SuperHero(String name, Helmet helmet, SuperPower superPower) {
        this.name = name;
        this.helmet = helmet;
        this.superPower = superPower;
    }
}
