package Entity;

public class Hoteles extends Alojamiento {

    protected Integer nHabitacion;

    protected Integer nCamas;

    protected Integer nPisos;

    protected Double costoHabitacion;

    public Hoteles() {
    }

    public Hoteles(Integer nHabitacion, Integer nCamas, Integer nPisos, Double costoHabitacion) {
        this.nHabitacion = nHabitacion;
        this.nCamas = nCamas;
        this.nPisos = nPisos;
        this.costoHabitacion = costoHabitacion;
    }

    public Hoteles(Integer nHabitacion, Integer nCamas, Integer nPisos, Double costoHabitacion, String nombre, String direcion, String lujar, String gerente) {
        super(nombre, direcion, lujar, gerente);
        this.nHabitacion = nHabitacion;
        this.nCamas = nCamas;
        this.nPisos = nPisos;
        this.costoHabitacion = costoHabitacion;
    }

    public Integer getnHabitacion() {
        return nHabitacion;
    }

    public void setnHabitacion(Integer nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public Integer getnCamas() {
        return nCamas;
    }

    public void setnCamas(Integer nCamas) {
        this.nCamas = nCamas;
    }

    public Integer getnPisos() {
        return nPisos;
    }

    public void setnPisos(Integer nPisos) {
        this.nPisos = nPisos;
    }

    public Double getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(Double costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "nHabitacion=" + nHabitacion + ", nCamas=" + nCamas + ", nPisos=" + nPisos + ", costoHabitacion=" + costoHabitacion + '}';
    }

    
    
}
