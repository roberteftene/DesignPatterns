package gof.dp.creational.factorymethod.documentsAPI;

public class DocWord extends DocInterface {

    public DocWord(String title, int vb) {
        this.setName(title);
    }

    @Override
    public String getType() {
        return "MSWord Document for text";
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
