package Entity;

import java.util.HashSet;

/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
*/
public class Cine {

    private String titulo;

    private HashSet <String> salaEspectadores;

    private double costoEntrada;

    public Cine() {
    }

    public Cine(String titulo, HashSet<String> salaEspectadores, double costoEntrada) {
        this.titulo = titulo;
        this.salaEspectadores = salaEspectadores;
        this.costoEntrada = costoEntrada;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public HashSet<String> getSalaEspectadores() {
        return salaEspectadores;
    }

    public void setSalaEspectadores(HashSet<String> salaEspectadores) {
        this.salaEspectadores = salaEspectadores;
    }

  

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }
    
    
}
