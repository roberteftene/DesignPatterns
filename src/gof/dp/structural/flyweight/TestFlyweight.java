package gof.dp.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

    public static void main(String[] args) {
        List<NPCCoord> soldiersArmy = new ArrayList<>();
        soldiersArmy.add(new NPCCoord(10,10,10,"red"));
        soldiersArmy.add(new NPCCoord(40,0,20,"blue"));
        soldiersArmy.add(new NPCCoord(50,20,100,"green"));

        Model3D soldierModel =
                (Model3D) Model3DFactory.getFlyweight(EModelType.SOLDIER);
        for (NPCCoord soldier : soldiersArmy) {
            soldierModel.display(soldier);
        }
    }
}
