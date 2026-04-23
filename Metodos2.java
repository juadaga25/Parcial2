import java.util.LinkedList;
import java.util.Queue;

public class Metodos2 {

    private Queue<Obj2> cola = new LinkedList<>();
    private Queue<Obj2> atendidos = new LinkedList<>();

    private void mostrarCliente(Obj2 c) {
        System.out.println("Turno: " + c.getId());
        System.out.println("  Nombre: " + c.getNombre());
        System.out.println("  Servicio: " + c.getTipoServicio());
        System.out.println("  Hora: " + c.getHoraLlegada());
        System.out.println("  Atendido: " + c.isAtendido());
    }


    
    public void encolar(Obj2 cliente) {
        cola.add(cliente);
    }

    
    public void desencolar() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            Obj2 cliente = cola.poll();
            cliente.setAtendido(true);
            atendidos.add(cliente);
            System.out.println("Atendiendo a: ");
            mostrarCliente(cliente);
        }
    }


    public void peek() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Siguiente cliente: ");
            mostrarCliente(cola.peek());
        }
    }

    
    public void verCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            for (Obj2 c : cola) {
                mostrarCliente(c);
            }
        }
    }

    
    public void mostrarTurnos() {
        System.out.println(" Atendidos ");
        for (Obj2 c : atendidos) {
            mostrarCliente(c);
        }

        System.out.println(" Pendientes ");
        for (Obj2 c : cola) {
            mostrarCliente(c);
        }
    }
}
