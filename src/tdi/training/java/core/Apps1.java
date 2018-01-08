package src.tdi.training.java.core;

import src.tdi.training.java.core.model.Sepeda;
import src.tdi.training.java.core.model.Motor;

public class Apps1{
    public static void main(String[] args){
        System.out.println("Hello world");
        Sepeda s1 = new Sepeda();
        s1.tingkatkanKecepatan(50);
        Motor m1 = new Motor();
        System.out.println("Kecepatan saat ini adalah : "+ s1.getKecepatan());
        System.out.println("Jumlah roda : "+s1.getRoda());
        s1.kurangiKecepatan(10);
        System.out.println("Kecepatan setelah dikurangi : "+s1.getKecepatan());
        System.out.println("=================================================");
        System.out.println("Motor memiliki spesifikasi sebagi berikut : ");
        System.out.println(m1.toString());
    }
}