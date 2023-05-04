/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual
(la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros
así como setters y getters.*/

package guia8app.Entidades;

/**
  * @author Alejandro
 */
public class Cafetera {
    private int max;
    private int actual;

    public Cafetera() {
    }

    public Cafetera(int max, int actual) {
        this.max = max;
        this.actual = actual;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    
    
    

}
