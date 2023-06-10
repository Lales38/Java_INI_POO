package Entidad;

public class Polideportivo extends Edificio {

    private String nombre;

    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, int alto, int largo, int ancho) {
        super(alto, largo, ancho);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public int calcularVolumen() {
      return calcularSuperficie()* alto;
    }

    
}
