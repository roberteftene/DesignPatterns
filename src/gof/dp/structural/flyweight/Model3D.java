package gof.dp.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Model3D implements Model3DFlyweight {

    String modelName;
    List<Integer> points = new ArrayList<>();

    @Override
    public void loadModel(String fileName) {
    }

    @Override
    public void display(NPCCoord coord) {
        System.out.println(coord.toString());
    }
}
