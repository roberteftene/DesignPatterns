package gof.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractNode {

    String groupName;
    List<AbstractNode> nodeList = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void addNode(AbstractNode abstractNode) {
        this.nodeList.add(abstractNode);
    }

    @Override
    public void removeNode(AbstractNode abstractNode) {
        this.nodeList.remove(abstractNode);
    }

    @Override
    public AbstractNode getNode(int index) {
        return this.nodeList.get(index);
    }

    @Override
    public void attack(String playerName) {
        this.nodeList.forEach(node -> node.attack(playerName));
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void retreat() {
        this.nodeList.forEach(NPCActions::retreat);
    }
}
