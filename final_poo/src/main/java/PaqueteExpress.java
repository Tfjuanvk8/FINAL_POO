public class PaqueteExpress extends Paquete {

    public PaqueteExpress(String guia, double peso, Zona zona) {
        super(guia, peso, zona);
    }

    @Override
    public double calcularCosto() {
        double costoBase = getZona().getTarifa() + (getPeso() * 1000);
        return costoBase * 1.5;
    }

    @Override
    public String getTipoServicio() {
        return "Pquete express";
    }

}
