package gof.dp.structural.flyweight;

public class NPCCoord {
    int x,y,z;
    String color;

    public NPCCoord(int x, int y, int z, String color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Position: "
                +"x:" + x
                +" y:" + y
                +" z:" + z;
    }
}
