public class ModuloEnergia extends ModuloMision {

    private double energiaGenerada;
    private double energiaPorCiclo;
    private double capacidadMaxima;

    public ModuloEnergia(int id, String nombre,
                         double salud, double costo,
                         double energiaPorCiclo, double capacidadMaxima) {
        super(id, nombre, salud, costo);
        this.energiaGenerada = 0;
        this.energiaPorCiclo = energiaPorCiclo;
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getEnergiaGenerada() {
        return energiaGenerada;
    }

    public double getEnergiaPorCiclo() {
        return energiaPorCiclo;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void procesarCiclo() {
        if (estaActivo()) {
            energiaGenerada = energiaGenerada + energiaPorCiclo;

            if (energiaGenerada > capacidadMaxima) {
                energiaGenerada = capacidadMaxima;
            }
        }
    }

    public String toString() {
        return "Energia | " + super.toString()
                + " | Energia generada: " + energiaGenerada
                + " | Energia por ciclo: " + energiaPorCiclo
                + " | Capacidad maxima: " + capacidadMaxima;
    }
}