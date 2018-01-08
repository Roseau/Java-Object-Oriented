package src.tdi.training.java.core.model;

public class Mobil extends Kendaraan{
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }
    //overload
    public void setNama(String nama, String pabrik){
        this.nama = nama;
        super.setPabrik(pabrik);
    }
    //override
    public void setPabrik(String nama){
        System.out.println("nama pabrik dari class mobil");
        super.setPabrik(nama); //super akan mereferensikan ke class kendaraan, sementara this akan mereferensikan ke class mobil(class ini)
    }

    public String nama(){
        return this.nama;
    }

    public void tampil(){
        System.out.println("Nama : "+nama());
        System.out.println("Lokasi : "+lokasi);
        System.out.println("Jumlah roda : "+super.getJumlahRoda());
        System.out.println("Pabrik Asal : "+super.getPabrik());
    }

}