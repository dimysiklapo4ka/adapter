package adapter.testAdapter;

import adapter.*;

/**
 * Created by d1mys1klapo4ka on 07.04.2017.
 */
public class Dvi1ToVga extends adapter.testAdapter.Vga implements Dvi1 {

    //private Dvi1ToVga dvi;

    public void getPictures1(){
        System.out.println("...pictures...");
    }

//    Dvi1ToVga (){}
//
//    Dvi1ToVga(Dvi1ToVga dvi){
//        this.dvi = dvi;
//    }

    void getPictures(){
        getPictures1();
    }
}
