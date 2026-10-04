public abstract class ModuloMision
        implements Comparable<ModuloMision> {

    private int id;
    private String nombre;
    private double salud;
    private double costoConstruccion;

    public ModuloMision(int id, String nombre,
                        double salud, double costoConstruccion) {
        this.id = id;
        this.nombre = nombre;
        this.salud = salud;
        this.costoConstruccion = costoConstruccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getCostoConstruccion() {
        return costoConstruccion;
    }

    public void setCostoConstruccion(double costoConstruccion) {
        this.costoConstruccion = costoConstruccion;
    }

    public void recibirDanio(double cantidad) {
        if (cantidad > 0) {
            salud = salud - cantidad;

            if (salud < 0) {
                salud = 0;
            }
        }
    }

    public boolean estaActivo() {
        return salud > 0;
    }

    public abstract void procesarCiclo();

    public int compareTo(ModuloMision otro) {
        if (costoConstruccion < otro.getCostoConstruccion()) {
            return -1;
        }

        if (costoConstruccion > otro.getCostoConstruccion()) {
            return 1;
        }

        return 0;
    }

    public boolean equals(Object objeto) {
        if (objeto instanceof ModuloMision) {
            ModuloMision otro = (ModuloMision) objeto;
            return id == otro.getId();
        }

        return false;
    }

    // Complementa equals para mantener la coherencia en Java.
    public int hashCode() {
        return id;
    }

    public String toString() {
        return "ID: " + id
                + " | Nombre: " + nombre
                + " | Salud: " + salud
                + " | Costo: " + costoConstruccion;
    }
}