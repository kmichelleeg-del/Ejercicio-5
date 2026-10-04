public class Main {

    public static void main(String[] args) {
        MisionModel modelo = new MisionModel();
        MisionView vista = new MisionView();

        MisionController controlador =
                new MisionController(modelo, vista);

        controlador.iniciar();
    }
}