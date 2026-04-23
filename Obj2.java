public class Obj2{
    private int id;
    private String nombre;
    private String tipoServicio;
    private String horaLlegada;
    private boolean atendido;

    public Obj2(int id, String nombre, String tipoServicio, String horaLlegada) {
        this.id = id;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.horaLlegada = horaLlegada;
        this.atendido = false;
    }

    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public boolean isAtendido() {
        return atendido;
    }

 
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
