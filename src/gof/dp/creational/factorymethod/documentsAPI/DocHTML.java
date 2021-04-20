package gof.dp.creational.factorymethod.documentsAPI;

public class DocHTML extends DocInterface {
    @Override
    public String getType() {
        return "HTML Document";
    }

    @Override
    public void print(String text) {
        System.out.println("<p>" + text + "</p>");
    }
}
