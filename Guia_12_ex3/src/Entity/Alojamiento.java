package Entity;

public class Alojamiento {

    protected String nombre;

    protected String direccion;

    protected String lujar;

    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direcion, String lujar, String gerente) {
        this.nombre = nombre;
        this.direccion = direcion;
        this.lujar = lujar;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direccion;
    }

    public void setDirecion(String direcion) {
        this.direccion = direcion;
    }

    public String getLujar() {
        return lujar;
    }

    public void setLujar(String lujar) {
        this.lujar = lujar;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", lujar=" + lujar + ", gerente=" + gerente + '}';
    }
    
    
}
