package gof.dp.creational.builder.general;

import gof.dp.creational.builder.general.services.WeaponService;

public class SuperHeroBuilder  extends  SuperHeroAbstractBuilder{
    SuperHero superHero;


    @Override
    public void addWeapon(WeaponService weaponService) {
        superHero.weaponService = weaponService;
    }

    @Override
    public void addLife(int lifePoints) {
        superHero.lifePoints += lifePoints;
    }

    @Override
    public void addArmor(int armor) {
        superHero.armor += armor;
    }

    @Override
    public void isVilan() {
        superHero.isVillain = true;
    }

    @Override
    public SuperHero getSuperHero() {
       return this.superHero;
    }

    public SuperHeroBuilder(String name, int lifePoints) {
        superHero = new SuperHero(name,lifePoints);
    }

}
