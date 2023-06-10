package Entity;

public class espectador {

    private String nombre;

    private int edad;

    private double dineroDisponible;

    public espectador() {
    }

    public espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
}
