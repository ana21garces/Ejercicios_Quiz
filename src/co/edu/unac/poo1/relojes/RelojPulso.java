package co.edu.unac.poo1.relojes;

import java.time.LocalDate;

public class RelojPulso extends Reloj {
    private String materialPulso;
    private Float precioPulso;

    public RelojPulso() {
        super();
    }

    public RelojPulso(String nuemeroSerial, String marca, Float precio, LocalDate fechaDeFabricacion, String materialPulso, Float precioPulso) {
        super(nuemeroSerial, marca, precio, fechaDeFabricacion);
        this.materialPulso = materialPulso;
        this.precioPulso = precioPulso;
    }

    public String getMaterialPulso() {
        return materialPulso;
    }

    public void setMaterialPulso(String materialPulso) {
        this.materialPulso = materialPulso;
    }

    public Float getPrecioPulso() {
        return precioPulso;
    }

    public void setPrecioPulso(Float precioPulso) {
        this.precioPulso = precioPulso;
    }

    @Override
    public String toString() {
        return "RelojPulso{" +
                "materialPulso='" + materialPulso + '\'' +
                ", precioPulso=" + precioPulso +
                ", nuemeroSerial='" + nuemeroSerial + '\'' +
                '}';
    }
}
