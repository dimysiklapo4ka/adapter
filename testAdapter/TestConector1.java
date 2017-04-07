package adapter.testAdapter;

/**
 * Created by d1mys1klapo4ka on 07.04.2017.
 */
public class TestConector1 {

    public static void main(String[] args) {

        //Dvi1ToVga notebock = new Dvi1ToVga();
        Vga monitor = new Dvi1ToVga(); //notebock);
        monitor.getPictures();
    }
}
