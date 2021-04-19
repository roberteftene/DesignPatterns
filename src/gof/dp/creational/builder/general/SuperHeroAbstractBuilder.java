package gof.dp.creational.builder.general;

import gof.dp.creational.builder.general.services.WeaponService;

public abstract class SuperHeroAbstractBuilder {
    public abstract void addWeapon(WeaponService weaponService);
    public abstract void addLife(int extraLife);
    public abstract void addArmor(int armor);
    public abstract void isVilan();
    public abstract SuperHero getSuperHero();

}
