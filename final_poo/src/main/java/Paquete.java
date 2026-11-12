
public abstract class Paquete {

    private final String guia;
    private final double peso;
    private final Zona zona;

    public Paquete(String guia, double peso, Zona zona) {
        this.guia = guia;
        this.peso = peso;
        this.zona = zona;
    }

    public String getGuia() {
        return guia;
    }

    public double getPeso() {
        return peso;
    }

    public Zona getZona() {
        return zona;
    }

    public abstract double calcularCosto();

    public abstract String getTipoServicio();

    @Override
    public String toString() {
        return "Paquete:" +
                "\n Numero d guia" + guia +
                "\n Peso" + peso +
                "\n Zona destino" + zona ;

    }
}
