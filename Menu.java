import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validaciones V = new Validaciones();
        Metodos m = new Metodos();
        int opcion;

        do {
            System.out.println("\n MENU ");
            System.out.println("1. Visitar pagina");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver historial");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = V.ValidarEntero(sc);
            opcion = V.ValidarRango(1, 4, opcion, sc);

            switch (opcion) {
                case 1:
                    System.out.print("URL: ");
                    String url = V.ValidarUrl(sc);

                    System.out.print("Titulo: ");
                    String titulo = V.ValidarCaracteres(sc);

                    System.out.print("Fecha: ");
                    String fecha = V.ValidarFecha(sc);

                    m.visitarPagina(url, titulo, fecha);
                    break;

                case 2:
                    m.retroceder();
                    break;

                case 3:
                    m.verHistorial();
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}
