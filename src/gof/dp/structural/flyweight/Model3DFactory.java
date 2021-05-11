package gof.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory  {
    static Map<String, Model3DFlyweight> models3D = new HashMap<>();
    static  {
        models3D.put(EModelType.SOLDIER.toString(),new Model3D());
        models3D.put(EModelType.LEVEL_BOSS.toString(),new Model3D());
    }
    public static Model3DFlyweight getFlyweight(EModelType type) {
        return models3D.get(type.toString());
    }
}
