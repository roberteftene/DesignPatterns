package gof.dp.creational.builder.innerBuilder;

import gof.dp.creational.builder.general.services.WeaponService;

public class Superhero {

    String name;
    int lifePoints;
    boolean isVillain;
    boolean isCriticalWounded;

    WeaponService leftHandWeapon;
    WeaponService rightHandWeapon;

    String superPower;
    String superSuperPower;

    private Superhero() {}

    public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticalWounded, WeaponService leftHandWeapon, WeaponService rightHandWeapon, String superPower, String superSuperPower) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.isVillain = isVillain;
        this.isCriticalWounded = isCriticalWounded;
        this.leftHandWeapon = leftHandWeapon;
        this.rightHandWeapon = rightHandWeapon;
        this.superPower = superPower;
        this.superSuperPower = superSuperPower;
    }

    public static class SuperheroBuilder {
        Superhero superhero = null;

        public SuperheroBuilder(String name, int lifePoints) {
            this.superhero = new Superhero();
            this.superhero.name = name;
            this.superhero.lifePoints = lifePoints;

        }

        public SuperheroBuilder isVillain(){
            this.superhero.isVillain = true;
            return this;
        }

        public SuperheroBuilder isWounded(){
            this.superhero.isCriticalWounded = true;
            return this;
        }

        public SuperheroBuilder setLeftWeapon(WeaponService weapon){
            this.superhero.leftHandWeapon = weapon;
            return this;
        }

        public SuperheroBuilder setRightWeapon(WeaponService weapon){
            this.superhero.rightHandWeapon = weapon;
            return this;
        }

        public SuperheroBuilder setSuperPower(String superPower){
            this.superhero.superPower = superPower;
            return this;
        }

        public SuperheroBuilder setSuperSuperPower(String superSuperPower){
            this.superhero.superSuperPower = superSuperPower;
            return this;
        }

        public Superhero build() {
            return this.superhero;
        }
    }
}
