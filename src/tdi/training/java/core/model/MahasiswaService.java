package src.tdi.training.java.core.model;

public class MahasiswaService extends Mahasiswa{
    public String Cari(){
        return "Ketemu";
    }
    public String Cari(String nama, Integer angkatan){
        //return new StringBuilder(nama).append(" ").append((angkatan).toString());
        return nama+" "+angkatan.toString();
    }
    public String Cari(Integer angkatan){
        return angkatan.toString();
    }
}