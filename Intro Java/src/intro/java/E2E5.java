/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import static java.lang.Math.sqrt;

import java.util.Scanner;

/**
  * @author Alejandro
 */
public class E2E5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       int num;
       Scanner leer = new Scanner (System.in); 

        System.out.println("Ingrese un Número entero: ");
        num = leer.nextInt();
        System.out.println("El doble del número ingresado es: "+ num*2);
        System.out.println("El triple del número ingresado es: "+ num*3);
        System.out.println("La raiz cuadrada del número es: "+ Math.sqrt(num));
        System.out.println("El cubo del número es: "+ Math.pow(num,3));

    }   
   
    
}
/*DEscribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
*/