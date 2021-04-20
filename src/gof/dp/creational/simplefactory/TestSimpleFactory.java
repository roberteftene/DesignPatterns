package gof.dp.creational.simplefactory;

import gof.dp.creational.simplefactory.products.WeaponType;
import gof.dp.creational.simplefactory.products.WeaponsFactory;

public class TestSimpleFactory {

    public static void main(String[] args) {
        SuperHero joker = new SuperHero("Joker");
        joker.setAbstractWeapon(WeaponsFactory.getWeapon(WeaponType.PISTOL,"White gun k96"));
        System.out.println(joker);
    }

}
