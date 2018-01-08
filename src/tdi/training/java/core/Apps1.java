package src.tdi.training.java.core;

import src.tdi.training.java.core.model.Sepeda;
import src.tdi.training.java.core.model.Motor;
import src.tdi.training.java.core.model.ZX10RR;


public class Apps1{
    public static void main(String[] args){
        System.out.println("Hello world");
        Sepeda s1 = new Sepeda();
        ZX10RR rea = new ZX10RR();
        s1.tingkatkanKecepatan(50);
        Motor m1 = new Motor();
        System.out.println("Kecepatan saat ini adalah : "+ s1.getKecepatan());
        System.out.println("Jumlah roda : "+s1.getRoda());
        s1.kurangiKecepatan(10);
        System.out.println("Kecepatan setelah dikurangi : "+s1.getKecepatan());
        System.out.println("=================================================");
        System.out.println("Motor memiliki spesifikasi sebagi berikut : ");
        System.out.println(m1.toString());
        System.out.println("engine : [engineBlock : "+rea.engineBloc+", cylinder : "+rea.cylinder+"]");
        System.out.println("breaking system : [ abs : "+rea.abs+"], profile race mode is : "+rea.raceMode());
    }
}