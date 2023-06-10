package guia_11.Main;

import EntityService.Simulador;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class G11_ex4 {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Simulador s = new Simulador();
        s.crearNombCompl();
        s.crearDni();
        
        
        s.crearAlumno();
        
    }

}
