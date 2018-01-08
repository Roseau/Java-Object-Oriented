package src.tdi.training.java.core.model;

public class Kendaraan{
    private Integer JumlahRoda = 4;
    private String pabrik;
    protected String lokasi = "redacted";

    public String getPabrik(){
        return pabrik;
    }

    public Integer getJumlahRoda(){
        return JumlahRoda;
    }

    public void setPabrik(String pabrik){
        this.pabrik = pabrik;
    }

    public void setJumlahRoda(Integer x){
        this.JumlahRoda = x;
    }

}