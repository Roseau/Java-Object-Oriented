package src.tdi.training.java.core.model;

public class Mobil extends Kendaraan{
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }
    //overload
    public void setNama(String nama, String pabrik){
        this.nama = nama;
        setPabrik(pabrik);
    }

    public void setPabrik(String nama){
        System.out.println("nama pabrik dari class mobil");
        super.setPabrik(nama);
    }

    public String nama(){
        return this.nama;
    }

    public void tampil(){
        System.out.println("Nama : "+nama());
        System.out.println("Lokasi : "+lokasi);
        System.out.println("Jumlah roda : "+JumlahRoda);
        System.out.println("Pabrik Asal : "+getPabrik());
    }

}