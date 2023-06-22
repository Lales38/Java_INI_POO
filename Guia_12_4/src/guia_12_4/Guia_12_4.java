
package guia_12_4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
  * @author Alejandro
 */
public class Guia_12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.calcularArea();
        c1.calcularPerimetro();
        
        Rectangulo r1 = new Rectangulo();
        r1.calcularArea();
        r1.calcularPerimetro();
    }
    
}
