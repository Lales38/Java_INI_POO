
package G7EP;

import G7_Class.Ex1_Cancion;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G7_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Ex1_Cancion C1= new Ex1_Cancion();
       
      C1.autor= "German";
      C1.titulo="Sera";
      
        System.out.println("C1 = " + C1.autor);  
        System.out.println("C1 = " + C1.titulo);
    }
    
}
