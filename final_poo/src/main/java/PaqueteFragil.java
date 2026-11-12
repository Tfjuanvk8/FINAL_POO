public class PaqueteFragil extends Paquete {

    private final String contenido;

    public PaqueteFragil(String guia, double peso, Zona zona, String contenido) {
        super(guia, peso, zona);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public double calcularCosto() {
        return getZona().getTarifa() + (getPeso() * 1000) + 5000;
    }

    @Override
    public String getTipoServicio() {
        return "Paquete fragil";
    }

}
