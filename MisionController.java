public class MisionController {

    private MisionModel modelo;
    private MisionView vista;

    public MisionController(MisionModel modelo, MisionView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        modelo.cargarDatosIniciales();

        int opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {
                case 1:
                    listarModulos();
                    break;

                case 2:
                    buscarPorId();
                    break;

                case 3:
                    buscarPorNombre();
                    break;

                case 4:
                    ordenarPorCosto();
                    break;

                case 5:
                    ejecutarCiclo();
                    break;

                case 0:
                    vista.mostrarMensaje("Programa finalizado.");
                    break;

                default:
                    vista.mostrarError("Opcion no valida.");
                    break;
            }
        } while (opcion != 0);
    }

    public void listarModulos() {
        vista.mostrarModulos(modelo.obtenerModulos());
    }

    public void buscarPorId() {
        int id = vista.pedirId();
        ModuloMision modulo = modelo.buscarModulo(id);

        if (modulo == null) {
            vista.mostrarError("No se encontro el modulo.");
        } else {
            vista.mostrarModulo(modulo);
        }
    }

    public void buscarPorNombre() {
        String nombre = vista.pedirNombre();
        ModuloMision modulo = modelo.buscarModulo(nombre);

        if (modulo == null) {
            vista.mostrarError("No se encontro el modulo.");
        } else {
            vista.mostrarModulo(modulo);
        }
    }

    public void ordenarPorCosto() {
        modelo.ordenarPorCosto();
        vista.mostrarMensaje("Modulos ordenados de menor a mayor costo.");
        listarModulos();
    }

    public void ejecutarCiclo() {
        modelo.procesarCiclo();

        vista.mostrarMensaje(
                "Ciclo " + modelo.getNumeroCiclo() + " completado.");

        listarModulos();
    }
}