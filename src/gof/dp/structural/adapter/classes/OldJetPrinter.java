package gof.dp.structural.adapter.classes;

public class OldJetPrinter implements OldJetPrinterInterface{

    private String idPrinter;

    @Override
    public void print(String text) {
        System.out.println("Printer: Printing... " + text);
    }

    @Override
    public void cancel() {
        System.out.println("Printer: CANCEL print");
    }
}
