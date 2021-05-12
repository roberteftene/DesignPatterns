package gof.dp.structural.proxy.virtual;

public class Image implements ImageInterface {
    private String fileName = null;
    @Override
    public void displayImage() {
        System.out.println("Display: " + this.fileName);
    }

    public Image(final String img) {
        this.fileName = img;

    }

    public void  loadImg(){
        System.out.println(this.fileName + " load image...");
    }
}
