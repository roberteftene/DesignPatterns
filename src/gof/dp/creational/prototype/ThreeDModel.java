package gof.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreeDModel implements Cloneable {

    String color;
    int height;
    List<Integer> points = null;

    public ThreeDModel(String color, int height) throws InterruptedException {
        System.out.println("Loading the 3D model...");
        Thread.sleep(2000);

        System.out.println("Applying color...");

        this.points = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            this.points.add(random.nextInt(1000));
        }

        this.color = color;
        this.height = height;
        System.out.println("Rendering final 3D model.");
    }

    private ThreeDModel() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ThreeDModel copy = new ThreeDModel();
        copy.color = this.color;
        copy.height = this.height;
        copy.points = new ArrayList<>(this.points);

        return copy;
    }
}
