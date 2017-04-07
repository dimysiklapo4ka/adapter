package adapter;

/**
 * Created by d1mys1klapo4ka on 07.04.2017.
 */
public class DviToVga extends Vga{

    private Dvi dvi;

    static class Dvi implements adapter.Dvi{

       void getPictures(){
           System.out.println("...Pictures...");
       }
    }

    DviToVga(Dvi dvi){
       this.dvi = dvi;
    }

    @Override
    void getPictures(){
        dvi.getPictures();
    }

}
