package Entidad;

public class EdificioDeOficinas extends Edificio {

    private int nOficinas;

    private int nPisos;

    private int nPersonas;

    public int calcularCantPersonas() {
        
        return nOficinas * nPisos * nPersonas;
    }

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nOficinas, int nPisos, int nPersonas) {
        this.nOficinas = nOficinas;
        this.nPisos = nPisos;
        this.nPersonas = nPersonas;
    }

    public EdificioDeOficinas(int nOficinas, int nPisos, int nPersonas, int alto, int largo, int ancho) {
        super(alto, largo, ancho);
        this.nOficinas = nOficinas;
        this.nPisos = nPisos;
        this.nPersonas = nPersonas;
    }

    public int getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(int nOficinas) {
        this.nOficinas = nOficinas;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    public int getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
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
