/*
 Realizar un algoritmo que llene un vector con los 100 primeros 
números enteros y los muestre por pantalla en orden descendente.
 */
package Guia_5;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class G5_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int cien[] = new int[100];
        
        for (int i = 0; i < 100; i++) {
            cien[i]= i+1;            
        }
        for (int j = 99; j >= 0; j--) {
            System.out.println(+cien[j]);  
        }
    }
}
