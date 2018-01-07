package src.tdi.training.java.core.model;

public class Sepeda{
    private Integer kecepatan = 20;
    private Integer jumlahRoda = 2;

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