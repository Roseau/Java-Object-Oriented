package src.tdi.training.java.core;

import src.tdi.training.java.core.model.Sepeda;
import src.tdi.training.java.core.model.Motor;
import src.tdi.training.java.core.model.ZX10RR;
import src.tdi.training.java.core.model.MahasiswaService;
import src.tdi.training.java.core.model.ParentOverride;
import src.tdi.training.java.core.model.ChildOverride;
import src.tdi.training.java.core.model.Kendaraan;
import src.tdi.training.java.core.model.Mobil;

public class Apps1{
    public static void main(String[] args){
        /*System.out.println("Hello world");
        Sepeda s1 = new Sepeda();
        ZX10RR rea = new ZX10RR();
        MahasiswaService ms = new MahasiswaService();
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
        System.out.println("aplikasi polymorphism");
        System.out.println(ms.Cari());
        System.out.println(ms.Cari("Erich zann",1987));
        System.out.println(ms.Cari(1965));
        ParentOverride ganti = new ParentOverride();
        System.out.println("Nilai ucap dari parent override : ");
        ganti.bicara();
        ganti = new ChildOverride();
        System.out.println("Nilai ucap dari child override : ");
        ganti.bicara();*/
        Mobil toyota = new Mobil();
        Mobil daihatsu = new Mobil("Daihatsu");
        Motorcycle yamaha = new Motorcycle();
        toyota.setNama("Proto 1");
        daihatsu.setNama("Proto III", "Pabrik dejah");
        System.out.println("============================");
        toyota.setPabrik("pabrik wassalam");
        toyota.tampil();
        System.out.println("============================");
        daihatsu.tampil();
        System.out.println("============================");
        yamaha.setPabrik(yamaha.getPabrik());
    }
}