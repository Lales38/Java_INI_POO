/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4EstControl;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class E4E1 {    
    
    public static void main(String[] args){
        
      int num;
      
      Scanner read = new Scanner (System.in);
      
        System.out.println("Ingrese un número entero: ");
        
        num = read.nextInt();
        
        if (num%2==0) {
            System.out.println("El número ingresado es PAR");
        }else{
            System.out.println("El número ingresado es IMPAR");
        }
            
            
        
    }
    
}
//Crear un programa que dado un número determine si es par o impar.
