package src.tdi.training.java.core.model;

public class Sepeda{
    protected Integer kecepatan = 20;
    protected Integer jumlahRoda = 2;
    protected String rangka = "Besi";

    public void tingkatkanKecepatan(int kec){
        this.kecepatan = this.kecepatan+kec;
    }
    public void kurangiKecepatan(int slow){
        this.kecepatan = this.kecepatan-slow;
    }
    public Integer getKecepatan(){
        return this.kecepatan;
    }
    public Integer getRoda(){
        return this.jumlahRoda;
    }
}