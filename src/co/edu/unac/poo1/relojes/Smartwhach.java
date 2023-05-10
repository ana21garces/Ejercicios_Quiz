package co.edu.unac.poo1.relojes;

import java.time.LocalDate;

public class Smartwhach extends RelojPulso {
    private Double version;
    private String Fabricante;

    public Smartwhach() {
    }

    public Smartwhach(String nuemeroSerial, String marca, Float precio, LocalDate fechaDeFabricacion, String materialPulso, Float precioPulso, Double version, String fabricante) {
        super(nuemeroSerial, marca, precio, fechaDeFabricacion, materialPulso, precioPulso);
        this.version = version;
        Fabricante = fabricante;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Smartwhach{" +
                "version=" + version +
                ", Fabricante='" + Fabricante + '\'' +
                ", nuemeroSerial='" + nuemeroSerial + '\'' +

                '}';
    }
}
