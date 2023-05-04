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
public class E2E3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una Frase.");
        cadena=leer.nextLine();      
       
        System.out.println(cadena.toUpperCase());    
       
        System.out.println(cadena.toLowerCase());  
        
        
    }

    private static String UpperCase(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String LowerCase(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
/*Escribir un programa que pida una 
frase y la muestre toda en mayúsculas 
y después toda en minúsculas.
*/