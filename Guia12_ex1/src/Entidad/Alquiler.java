package Entidad;



import java.util.Date;

public class Alquiler {

    private String nombre;

    private Integer dni;

    private Date ini;

    private Date fin;

    private Integer posicion;

    private String tipoBarco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, Date ini, Date fin, Integer posicion, String tipoBarco) {
        this.nombre = nombre;
        this.dni = dni;
        this.ini = ini;
        this.fin = fin;
        this.posicion = posicion;
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getIni() {
        return ini;
    }

    public void setIni(Date ini) {
        this.ini = ini;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    } 
    

 
}
