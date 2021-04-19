package gof.dp.creational.builder.innerBuilder;

import gof.dp.creational.builder.general.services.Pistol;
import gof.dp.creational.builder.general.services.ShotGun;

public class TestInnerBuilderHero {
    public static void main(String[] args) {

        Superhero hulk = new Superhero.SuperheroBuilder("Hulk",100)
                .setLeftWeapon(new ShotGun())
                .setRightWeapon(new Pistol())
                .isVillain()
                .build();

    }
}
