package adapter;

/**
 * Created by d1mys1klapo4ka on 07.04.2017.
 */
public class TestConector {

    public static void main(String[] args) {

        DviToVga.Dvi notebock = new DviToVga.Dvi();
        Vga monitor = new DviToVga(notebock);
        monitor.getPictures();
    }
}
