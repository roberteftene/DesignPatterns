package gof.dp.creational.factorymethod.documentsAPI;

public class DocOpenOffice extends DocInterface {

    public DocOpenOffice(String name) {
        this.setName(name);
    }

    @Override
    public String getType() {
        return "OpenOffice Document for text";
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
