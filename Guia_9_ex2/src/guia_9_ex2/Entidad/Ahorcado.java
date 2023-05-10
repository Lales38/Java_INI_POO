package guia_9_ex2.Entidad;

/**
 * @author Alejandro
 */
public class Ahorcado {

    

private String[] palabra;
    private int cantLetras;
    private int jugadas;
    private int letrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetras, int jugadas, int letrasEncontradas) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.jugadas = jugadas;
        this.letrasEncontradas = letrasEncontradas;
    }

    public Ahorcado(String[] palabra, int jugadas) {
        this.palabra = palabra;
        this.jugadas = jugadas;
    }

   

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    

}
