package co.edu.unac.poo1.relojes;

import java.time.LocalDate;

public class Reloj {
    protected String nuemeroSerial;
    private String marca;
    private Float precio;
    private LocalDate fechaDeFabricacion;

    public Reloj() {
        super();
    }

    public Reloj(String nuemeroSerial, String marca, Float precio, LocalDate fechaDeFabricacion) {
        this.nuemeroSerial = nuemeroSerial;
        this.marca = marca;
        this.precio = precio;
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public String getNuemeroSerial() {
        return nuemeroSerial;
    }

    public void setNuemeroSerial(String nuemeroSerial) {
        this.nuemeroSerial = nuemeroSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public LocalDate getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(LocalDate fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "nuemeroSerial='" + nuemeroSerial + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", fechaDeFabricacion=" + fechaDeFabricacion +
                '}';
    }
}
