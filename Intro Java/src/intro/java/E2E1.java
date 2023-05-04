/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class E2E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer =new Scanner(System.in);
     int num1;
     int num2;
     int num;
        System.out.println("Ingrese el primer número: ");
        num1=leer.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2=leer.nextInt();
        
        num=num1+num2;
        System.out.println("La suma de los Numeros es: " + num); 
   
             
    }
    
}
/*Escribir un programa que pida dos números enteros por teclado y calcule la 
suma de los dos. El programa deberá después mostrar el resultado de la suma*/