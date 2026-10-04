public class ModuloVuelo extends ModuloMision {

    private double datosRecolectados;
    private double datosPorCiclo;
    private double consumoEnergia;

    public ModuloVuelo(int id, String nombre,
                       double salud, double costo,
                       double datosPorCiclo, double consumoEnergia) {

        super(id, nombre, salud, costo);

        this.datosRecolectados = 0;
        this.datosPorCiclo = datosPorCiclo;
        this.consumoEnergia = consumoEnergia;
    }

    public double getDatosRecolectados() {
        return datosRecolectados;
    }

    public double getDatosPorCiclo() {
        return datosPorCiclo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void procesarCiclo() {
        if (estaActivo()) {
            datosRecolectados = datosRecolectados + datosPorCiclo;
        }
    }

    public String toString() {
        return "Vuelo | " + super.toString()
                + " | Datos recolectados: " + datosRecolectados
                + " | Datos por ciclo: " + datosPorCiclo
                + " | Consumo de energia: " + consumoEnergia;
    }
}