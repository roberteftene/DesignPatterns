package gof.dp.creational.builder.general;

import gof.dp.creational.builder.general.services.ShotGun;

public class TestSuperHeroBuilder {

    public static void main(String[] args) {

        SuperHeroBuilder builder = new SuperHeroBuilder("Batman",100);
        builder.addLife(200);
        builder.addWeapon(new ShotGun());
        builder.addArmor(5000);
        builder.isVilan();
        SuperHero batman = builder.getSuperHero();

        System.out.println(batman);
    }

}
