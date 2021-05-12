package gof.dp.structural.proxy.virtual;

public class ImageProxy implements ImageInterface {

    private Image realImage = null;
    private String file = null;

    public ImageProxy(String file) {
        this.file = file;
    }

    @Override
    public void displayImage() {
        if(DoWeHaveMemory(this.file)) {
            if(realImage == null) {
                realImage = new Image(file);
            }
            realImage.displayImage();
        }
    }

    boolean DoWeHaveMemory(String fileName) {
        System.out.println("Memory check...");
        return true;
    }
}
