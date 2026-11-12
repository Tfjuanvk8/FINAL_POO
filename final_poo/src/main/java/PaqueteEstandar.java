
public class PaqueteEstandar extends Paquete {

    public PaqueteEstandar(String guia, double peso, Zona zona) {
        super(guia, peso, zona);
    }

    @Override
    public double calcularCosto() {
        return getZona().getTarifa() + (getPeso() * 1000);
    }

    @Override
    public String getTipoServicio() {
        return "Paquete estandra";
    }


}
