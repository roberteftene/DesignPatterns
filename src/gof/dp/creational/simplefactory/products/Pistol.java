package gof.dp.creational.simplefactory.products;

public class Pistol extends AbstractWeapon {

    int noBullets;

    public Pistol(int noBullets, String description, int power) {
        super();
        this.description = description;
        this.powerLvl = power;
        this.noBullets = noBullets;
    }

    @Override
    public void pewPew() {
        System.out.println("Poc poc");
    }

    public void setNoBullets(int noBullets) {
        this.noBullets = noBullets;
    }

    @Override
    public String toString() {
        return super.toString() + this.noBullets;
    }
}
