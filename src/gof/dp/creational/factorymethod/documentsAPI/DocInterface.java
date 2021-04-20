package gof.dp.creational.factorymethod.documentsAPI;

public abstract class DocInterface {
    private String name;
    public abstract String getType();
    public abstract void print(String text);

    public void setName(String name) {
        this.name = name;
    }
}
