/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;



/**
  * @author Alejandro
 */
public class E2E4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double tempC, tempF;
        System.out.println("Ingrese la temperatura en Centígrados: ");
        Scanner leer= new Scanner (System.in);
        tempC = leer.nextInt();
        tempF = 32 + (9*(tempC/5));
        System.out.println("La temperatura ingresada en Fahrenheit es: " + tempF);
                
    }
   
    
}
/*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/