package gof.dp.structural.proxy.virtual;

public class TestVirtualProxy {

    public static void main(String[] args) {
        ImageInterface img1 =
                new Image("Car.png");
        System.out.println("Do other stuff");

        img1.displayImage();
        img1.displayImage();
        img1.displayImage();

        final ImageInterface IMG1 =
                new ImageProxy("photo1.png");
        final ImageInterface IMG2 =
                new ImageProxy("photo2.png");

        IMG1.displayImage();
        IMG1.displayImage();
        IMG2.displayImage();
        IMG2.displayImage();
        IMG1.displayImage();
    }
}
