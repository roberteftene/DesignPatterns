package gof.dp.creational.simplefactory.products;

public abstract class AbstractWeapon {

    protected int powerLvl;
    protected String description;

    public abstract void pewPew();

    @Override
    public String toString() {
        return "AbstractWeapon{" +
                "powerLvl=" + powerLvl +
                ", description='" + description + '\'' +
                '}';
    }
}
