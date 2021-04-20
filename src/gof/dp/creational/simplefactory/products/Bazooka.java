package gof.dp.creational.simplefactory.products;

public class Bazooka extends AbstractWeapon {

    public Bazooka(String description) {
        this.description = description;
        this.powerLvl = 1000;
    }

    @Override
    public void pewPew() {
        System.out.println("BOOOM");
    }

    @Override
    public String toString() {
        return "Bazooka{" +
                "powerLvl=" + powerLvl +
                ", description='" + description + '\'' +
                '}';
    }
}
