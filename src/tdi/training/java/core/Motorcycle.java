package src.tdi.training.java.core;

import src.tdi.training.java.core.model.Kendaraan;

public class Motorcycle extends Kendaraan{
    public String getPabrik(){
        return "Yamaha";
    }

    public void setPabrik(String pabrik){
        super.setPabrik("Kendaraan belum diisi!");
        System.out.println(
            String.format("dari kelas motor: %s", this.getPabrik())
        );
        System.out.println(
            String.format("dari kelas kendaraan: %s", super.getPabrik())
        );
    }
}