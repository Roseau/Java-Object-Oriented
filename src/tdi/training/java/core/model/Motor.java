package src.tdi.training.java.core.model;

public class Motor extends Sepeda{
    private String mesin = "4 tak, 2 Cylinder";
    
    public Motor(){
        super.rangka = "Trails";
    }

    public String toString(){
        return "mesin motor : "+getMesin()+" dan memiliki rangka : "+getRangka();
    }

    public String getMesin(){
        return mesin;
    }

    public  String getRangka(){
        return super.rangka;
    }

}