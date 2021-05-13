package gof.dp.behavioral.state;

public class SuperHero {

    public static final int CRITICAL_VALUE = 50;
    public static final int WOUNDED_VALUE = 200;
    String name;
    int lifePoints;

    IMoveState moveState = null;

    public SuperHero(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.moveState = new InitialState();
    }

    public void move() {
        if (this.moveState != null) {
            this.moveState.changeCharacterLocation();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    void takeAHit(int lifePoints) {
        this.lifePoints -= lifePoints;
        this.requestStateChange();
    }

    void heal(int lifePoints) {
        this.lifePoints += lifePoints;
        this.requestStateChange();
    }

    private void requestStateChange() {
        if (this.lifePoints <= CRITICAL_VALUE) {
            this.moveState = new CriticalState();
        } else if (this.lifePoints >= CRITICAL_VALUE && this.lifePoints <= WOUNDED_VALUE) {
            this.moveState = new WoudedState();
        } else {
            this.moveState = new InitialState();
        }
    }


}
