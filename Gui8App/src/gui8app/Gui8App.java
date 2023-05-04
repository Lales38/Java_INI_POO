
package gui8app;

import guia8app.Entidades.Persona;
import guia8app.Servicios.PersonaService;

/**
 *
 * @author Alejandro
 */
public class Gui8App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService ps = new PersonaService();
       
        Persona p1=ps.crearPersona();
        
        System.out.println(p1.toString());
    }
    
}
