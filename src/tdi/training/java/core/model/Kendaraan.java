package src.tdi.training.java.core.model;

public class Kendaraan{
    public Integer JumlahRoda = 4;
    private String pabrik;
    protected String lokasi = "redacted";

    public String getPabrik(){
        return pabrik;
    }

    public void setPabrik(String pabrik){
        this.pabrik = pabrik;
    }
}