package Main;

import Entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G13_e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        DivisionNumero dn = new DivisionNumero();
        

        System.out.println("Ingrese el primer número");
        System.out.print(">>");
        String a = read.nextLine();

        System.out.println("Ingrese el segundo número");
        System.out.print(">>");
        String b = read.nextLine();
        
        dn.parSeInt(a, b);
        
        dn.dividir();
        
        
        
    }

}
