package gof.dp.behavioral.state;

public class WoudedState implements IMoveState {
    @Override
    public void changeCharacterLocation() {
        System.out.println("I am wounded, I will move slowly.");
    }
}
