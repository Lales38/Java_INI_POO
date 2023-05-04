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
public class E3Teoria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 ; 
        int num2 ;  
        
      Scanner read = new Scanner (System.in) ;
        System.out.println("Ingrese el primer número entero: ");
        num1 = read.nextInt();
        
        System.out.println("Ingrese el segundo número entero: ");
        num2 = read.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos numedros ingresados son mayores a 25"); 
        }else if(num1 >25){
            System.out.println("El primer número ingresado es mayor a 25");
            
        }else if(num2>25){
            System.out.println("El segundo numero ingresado es mayor a 25");
        }else {
            System.out.println("Ningun número ingresado es mayor a 25");
        } 

}
}