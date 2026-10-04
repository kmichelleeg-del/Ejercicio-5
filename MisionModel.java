import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MisionModel {

    private List<ModuloMision> modulos;
    private int numeroCiclo;

    public MisionModel() {
        modulos = new ArrayList<ModuloMision>();
        numeroCiclo = 0;
    }

    public void cargarDatosIniciales() {
        modulos.clear();
        numeroCiclo = 0;

        // Datos de ejemplo: el UML no establece estos valores.
        agregarModulo(new ModuloVuelo(
                1, "Explorador", 100, 1500, 25, 10));

        agregarModulo(new ModuloTierra(
                2, "Estacion", 100, 1200, 20, 8));

        agregarModulo(new ModuloEnergia(
                3, "Panel solar", 100, 1800, 50, 500));
    }

    public void agregarModulo(ModuloMision modulo) {
        if (modulo != null) {
            if (buscarModulo(modulo.getId()) == null) {
                modulos.add(modulo);
            }
        }
    }

    public List<ModuloMision> obtenerModulos() {
        return modulos;
    }

    public ModuloMision buscarModulo(int id) {
        for (int i = 0; i < modulos.size(); i++) {
            if (modulos.get(i).getId() == id) {
                return modulos.get(i);
            }
        }

        return null;
    }

    public ModuloMision buscarModulo(String nombre) {
        for (int i = 0; i < modulos.size(); i++) {
            if (modulos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return modulos.get(i);
            }
        }

        return null;
    }

    public void ordenarPorCosto() {
        Collections.sort(modulos);
    }

    public void procesarCiclo() {
        for (int i = 0; i < modulos.size(); i++) {
            modulos.get(i).procesarCiclo();
        }

        numeroCiclo++;
    }

    public int getNumeroCiclo() {
        return numeroCiclo;
    }
}