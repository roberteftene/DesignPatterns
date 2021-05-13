package gof.dp.behavioral.state;

public class TestState {

    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman",500);
        superman.move();

        superman.takeAHit(350);
        superman.move();

        superman.takeAHit(120);
        superman.move();

        superman.heal(500);
        superman.move();
    }

}

