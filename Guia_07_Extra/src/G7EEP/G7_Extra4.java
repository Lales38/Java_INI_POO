
package G7EEP;

import G7EjeExtraClass.Ex4_Cuenta;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G7_Extra4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Ex4_Cuenta C1= new Ex4_Cuenta();
       
        C1.setSaldo(10000);
       
        C1.setTitular("Ale S");
        
        System.out.println("Ingrese el monto a retirar: ");
        System.out.print(">>");
        C1.retirar_dinero(read.nextDouble());
    }
}
