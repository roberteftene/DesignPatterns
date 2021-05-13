package gof.dp.behavioral.state;

public class InitialState implements IMoveState {
    @Override
    public void changeCharacterLocation() {
        System.out.println("I can move without any problem, because I am not wounded.");
    }
}
