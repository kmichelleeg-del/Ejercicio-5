import java.util.List;
import java.util.Scanner;

public class MisionView {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println();
        System.out.println("CONTROL DE MISION");
        System.out.println("1. Listar modulos");
        System.out.println("2. Buscar por ID");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Ordenar por costo");
        System.out.println("5. Ejecutar ciclo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public int leerOpcion() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            mostrarError("Debe ingresar un numero entero.");
            System.out.print("Intente nuevamente: ");
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public int pedirId() {
        System.out.print("Ingrese el ID: ");
        return leerOpcion();
    }

    public String pedirNombre() {
        System.out.print("Ingrese el nombre: ");
        return scanner.nextLine();
    }

    public void mostrarModulos(List<ModuloMision> modulos) {
        if (modulos.size() == 0) {
            mostrarMensaje("No hay modulos registrados.");
        } else {
            for (int i = 0; i < modulos.size(); i++) {
                mostrarModulo(modulos.get(i));
            }
        }
    }

    public void mostrarModulo(ModuloMision modulo) {
        System.out.println(modulo.toString());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}