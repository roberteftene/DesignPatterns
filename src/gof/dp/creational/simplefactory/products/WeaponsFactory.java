package gof.dp.creational.simplefactory.products;

public class WeaponsFactory {

    static public AbstractWeapon getWeapon(WeaponType type, String description) {
        AbstractWeapon weapon = null;
        switch (type) {
            case BAZOOKA:
                weapon = new Bazooka(description);
                break;
            case PISTOL:
                weapon = new Pistol(50,description,30);
                break;
        }
        return weapon;
    }

}
