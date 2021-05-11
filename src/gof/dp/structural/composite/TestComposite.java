package gof.dp.structural.composite;

public class TestComposite {

    public static void main(String[] args) {
        AbstractNode g1 = new Group("Red team");
        g1.addNode(new NPC("SoldierOne",100));
        g1.addNode(new NPC("SoldierTwo",250));

        AbstractNode g2 = new Group("Blue team");
        g2.addNode(new NPC("Soldier Three",500));
        g2.addNode(new NPC("Demolition",1000));

        AbstractNode lvlGroup = new Group("Level 2");
        lvlGroup.addNode(new NPC("Boss",1400));
        lvlGroup.addNode(g1);
        lvlGroup.addNode(g2);

        lvlGroup.attack("Boss");
        lvlGroup.retreat();
        lvlGroup.getNode(0).move();
    }
}
