import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        Metodos2 m = new Metodos2();
        int opcion = 0;
        int turno = 1;
        String nombre;
        String tipo;
        String hora;
        

        do {
            System.out.println("\n MENU BANCO ");
            System.out.println("1. Llegada de cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente cliente");
            System.out.println("4. Ver cola");
            System.out.println("5. Mostrar turnos");
            System.out.println("0. Salir");
            opcion = v.ValidarEntero(sc);
            opcion = v.ValidarRango(0, 5, opcion, sc);
            

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    nombre = v.ValidarCaracteres(sc);

                    System.out.print("Tipo de servicio: ");
                    tipo = v.ValidarCaracteres(sc);

                    System.out.print("Hora de llegada: ");
                    hora = v.esHoraValida(sc);

                    Obj2 cliente = new Obj2(turno, nombre, tipo, hora);
                    turno++;

                    m.encolar(cliente);
                    break;

                case 2:
                    m.desencolar();
                    break;

                case 3:
                    m.peek();
                    break;

                case 4:
                    m.verCola();
                    break;

                case 5:
                    m.mostrarTurnos();
                    break;

            }

        } while (opcion != 0);

        sc.close();
    }
}
