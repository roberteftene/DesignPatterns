package gof.dp.creational.simplefactory;

import gof.dp.creational.simplefactory.products.AbstractWeapon;

public class SuperHero {

    String name;
    AbstractWeapon abstractWeapon;

    public SuperHero(String name) {
        this.name = name;
    }

    public AbstractWeapon getAbstractWeapon() {
        return abstractWeapon;
    }

    public void setAbstractWeapon(AbstractWeapon abstractWeapon) {
        this.abstractWeapon = abstractWeapon;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", abstractWeapon=" + abstractWeapon +
                '}';
    }
}
