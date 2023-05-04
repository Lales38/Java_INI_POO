package guia_9_e1.Entidades;


/**
 * @author Alejandro
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String)
 * y su longitud. Agregar constructor vacío y con atributo frase solamente. 
 * Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase 
 * de manera automática. 
 */
public class Cadena {

    private String frase;
    private int largo;

    public Cadena() {
    }

    public Cadena(String frase, int largo) {
        this.frase = frase;
        this.largo = largo;
    }

    

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

   
  
    
}
