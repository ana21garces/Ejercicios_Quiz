package co.edu.unac.poo1.clientes;

public class Cliente {
    protected String numeroDeCedula;
    private String nombreCompleto;
    private Float presopuesto;
    private Nacionalidad nacionalidad;

    public Cliente() {
    }

    public Cliente(String numeroDeCedula, String nombreCompleto, Float presopuesto, Nacionalidad nacionalidad) {
        this.numeroDeCedula = numeroDeCedula;
        this.nombreCompleto = nombreCompleto;
        this.presopuesto = presopuesto;
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Float getPresopuesto() {
        return presopuesto;
    }

    public void setPresopuesto(Float presopuesto) {
        this.presopuesto = presopuesto;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroDeCedula='" + numeroDeCedula + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", presopuesto=" + presopuesto +
                ", nacionalidad=" + nacionalidad +
                '}';
    }
}
