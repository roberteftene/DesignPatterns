package gof.dp.structural.adapter.classes;

public class Adapter extends OldJetPrinter implements LaserPrinterInterface  {

    @Override
    public void laserPrint(String[] paragraph) {
        StringBuilder sb = new StringBuilder();
        for (String s : paragraph) {
            sb.append(" " + s);
        }
        this.print(sb.toString());
    }

    @Override
    public void cancelPrint() {
        this.cancel();
    }
}
