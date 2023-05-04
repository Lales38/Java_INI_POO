
package guia_9_e1;

import Servicio.CadenaServicio;
import guia_9_e1.Entidades.Cadena;

/**
 *
 * @author Alejandro
 */
public class Guia_9_e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs= new CadenaServicio();
        Cadena c1= cs.crearCad();
        
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLong(c1);
        cs.unirFrase(c1);
        cs.reemplazar(c1);
        cs.contiene(c1);
    }
    
}
