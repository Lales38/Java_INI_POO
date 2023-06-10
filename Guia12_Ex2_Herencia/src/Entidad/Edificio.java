package Entidad;

public abstract class Edificio {

    protected int alto;

    protected int largo;

    protected int ancho;

    public  int calcularSuperficie(){
        
        return largo * ancho;
    } 
    public abstract int calcularVolumen();
  
    public Edificio() {
    }

    public Edificio(int alto, int largo, int ancho) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
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
     
    
}
