/*
 ISBN, Título, Autor, Número de páginas
 */
package libreria.entidades;

/**
 *
 * @author Alejandro
 */
public class Libro {

    public String ISBN;
    public String Título;
    public String Autor;
    public String NumPag;

    public Libro() {
    }

    public Libro(String ISBN, String Título, String Autor, String NumPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", NumPag=" + NumPag + '}';
    }

 

}
