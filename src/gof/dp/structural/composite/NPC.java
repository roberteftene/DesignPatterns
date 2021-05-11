package gof.dp.structural.composite;

public class NPC extends AbstractNode {

    String name;
    int power;

    public NPC(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void attack(String playerName) {
        System.out.println(String.format("%s is attacking %s", this.name,playerName));
    }

    @Override
    public void move() {
        System.out.println(String.format("%s is moving",this.name));
    }

    @Override
    public void retreat() {
        System.out.println(String.format("%s is retreating",this.name));
    }

    @Override
    public void addNode(AbstractNode abstractNode) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNode(AbstractNode abstractNode) {
        throw new UnsupportedOperationException();

    }

    @Override
    public AbstractNode getNode(int index) {
        throw new UnsupportedOperationException();
    }
}
