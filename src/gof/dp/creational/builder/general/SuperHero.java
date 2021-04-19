package gof.dp.creational.builder.general;

import gof.dp.creational.builder.general.services.WeaponService;

public class SuperHero {

    String name;
    int lifePoints;
    boolean isVillain;
    int armor;

    WeaponService weaponService;

    private SuperHero() {}

    public SuperHero(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public boolean isVillain() {
        return isVillain;
    }

    public void setVillain(boolean villain) {
        isVillain = villain;
    }

    public WeaponService getWeaponService() {
        return weaponService;
    }

    public void setWeaponService(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", isVillain=" + isVillain +
                ", armor=" + armor +
                ", weaponService=" + weaponService +
                '}';
    }
}
