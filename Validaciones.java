import java.util.Scanner;

public class Validaciones {
    // Scanner sc = new Scanner(System.in);

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese una opcion valida");
            sc.nextLine();

        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, int numero, Scanner sc) {
        Validaciones V = new Validaciones();

        while (numero < n1 || numero > n2) {

            System.out.println("Ingrese un rango de: " + n1 + " hasta " + n2);
            numero = V.ValidarEntero(sc);

        }
        return numero;

    }

    public String ValidarUrl(Scanner sc) {
        String Url = sc.next();
        while (!Url.matches("^(https?://)?([\\w.-]+)\\.([a-z]{2,6})([/\\w .-]*)*/?$")) {
            System.out.print("Ingresa una URL válida: ");
            Url = sc.next();
        }

        return Url;
    }

    public String ValidarCaracteres(Scanner sc) {
        String texto = sc.next();

        while (!texto.matches("[a-zA-Z ]+")) {
            System.out.println("Error: solo se permiten letras. Intenta de nuevo:");
            texto = sc.next();
        }

        return texto;
    }

    public String ValidarFecha(Scanner sc) {
        String texto = sc.next();

        while (!texto.matches("^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-9]{4})$")) {
            System.out.println("Error: fecha inválida. Intenta de nuevo (dd/MM/xxxx):");
            texto = sc.nextLine();
        }

        return texto;
    }

    public String esHoraValida(Scanner sc) {
    
    String regex = "([01]\\d|2[0-3]):[0-5]\\d(:[0-5]\\d)?";

    String hora = sc.next();

    while (!hora.matches(regex)) {
        System.out.println("Error: hora inválida. Intenta de nuevo formato HH:mm:");
        hora = sc.next();
    }

    return hora;
}



    
}
