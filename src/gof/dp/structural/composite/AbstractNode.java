package gof.dp.structural.composite;

public abstract class AbstractNode implements NPCActions {

    public abstract void addNode(AbstractNode abstractNode);
    public abstract void removeNode(AbstractNode abstractNode);
    public abstract AbstractNode getNode(int index);

}
