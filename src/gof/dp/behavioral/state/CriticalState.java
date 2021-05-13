package gof.dp.behavioral.state;

public class CriticalState implements IMoveState {
    @Override
    public void changeCharacterLocation() {
        System.out.println("I am critically wounded. I can't move anymore!");
    }
}
