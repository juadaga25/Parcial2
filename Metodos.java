import java.util.Stack;

public class Metodos {

    private Stack<PaginaWeb> pila = new Stack<>();


    public void visitarPagina(String url, String titulo, String fecha) {
        PaginaWeb pagina = new PaginaWeb(url, titulo, fecha);
        pila.push(pagina);
        System.out.println("Pagina guardada.");
    }

    
    public void retroceder() {
        if (!pila.isEmpty()) {
            pila.pop();
            System.out.println("Retrocediste.");

            if (!pila.isEmpty()) {
                PaginaWeb actual = pila.peek();
                System.out.println("Actual: " + actual.getTitulo());
            } else {
                System.out.println("No hay paginas.");
            }
        } else {
            System.out.println("Pila vacia.");
        }
    }

    
    public void verHistorial() {
        if (pila.isEmpty()) {
            System.out.println("Historial vacio.");
        } else {
            System.out.println("\n HISTORIAL ");
            for (PaginaWeb p : pila) {
                System.out.println("Titulo: " + p.getTitulo() +
                                   " | URL: " + p.getUrl());
            }
        }
    }
}