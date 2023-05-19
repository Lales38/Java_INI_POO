
package G7EjeExtraClass;

/**
 *
 * @author Alejandro
 */
public class Ex1_Cancion {

    public String titulo;
    public String autor;
    public String melodia;

    public Ex1_Cancion() {

        titulo = "";
        autor = "";
    }

    public Ex1_Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
