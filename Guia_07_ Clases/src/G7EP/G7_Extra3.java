
package G7EP;


import G7_Class.Ex3_Juego;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G7_Extra3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Ex3_Juego J1 = new Ex3_Juego();
        
        System.out.println("Ingrese el número a buscar: ");
        System.out.print(">>");
        J1.setN1(read.nextInt());
        System.out.println("Ingrese la cantidad de intentos : ");
        System.out.print(">>");
        J1.setCantInt(read.nextInt());
        
        J1.inicio_juego();
        
    
    }

}
