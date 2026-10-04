public class ModuloTierra extends ModuloMision {

    private double datosDescargados;
    private double capacidadDescarga;
    private double consumoEnergia;

    public ModuloTierra(int id, String nombre,
                        double salud, double costo,
                        double capacidadDescarga, double consumoEnergia) {
        super(id, nombre, salud, costo);
        this.datosDescargados = 0;
        this.capacidadDescarga = capacidadDescarga;
        this.consumoEnergia = consumoEnergia;
    }

    public double getDatosDescargados() {
        return datosDescargados;
    }

    public double getCapacidadDescarga() {
        return capacidadDescarga;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void procesarCiclo() {
        if (estaActivo()) {
            datosDescargados = datosDescargados + capacidadDescarga;
        }
    }

    public String toString() {
        return "Tierra | " + super.toString()
                + " | Datos descargados: " + datosDescargados
                + " | Capacidad de descarga: " + capacidadDescarga
                + " | Consumo de energia: " + consumoEnergia;
    }
}