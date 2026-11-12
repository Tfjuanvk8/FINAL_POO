public class Main {
    static void main(String[] args) {
        PaqueteEstandar estandar1 = new PaqueteEstandar("ey2001", 5, Zona.ORIENTE);
        //Despacho despacho1 =new Despacho(estandar1, "Andres", "D-1");
        Despacho<Paquete> despacho = new Despacho<>();

        estandar1.calcularCosto();

    }
}
