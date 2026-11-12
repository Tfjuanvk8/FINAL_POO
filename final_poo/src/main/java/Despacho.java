import java.util.ArrayList;


public class Despacho <T extends Paquete> {

    private final ArrayList<T> paquetes;

    public Despacho() {
        paquetes = new ArrayList<>();
    }
    public void agregar (T Paquete) {

        if (Paquete == null)  {
            throw new IllegalArgumentException("paquete inválido");
        }

        if (paquetes.contains(Paquete)) {
            throw new IllegalArgumentException("Ya existe un recurso con ese codigo");
        }

        paquetes.add(Paquete);
    }
}





