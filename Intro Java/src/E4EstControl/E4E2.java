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
public class E4E2 {

    public static void main(String[] args) {
        String palabra;
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una palabra:");
        palabra = read.next();
        
        if (palabra.equals("eureka")) {
            System.out.println("Correcto"); 
        }else{
            System.out.println("Incorrecto");
        }
    }

}
///Crear un programa que pida una frase y si esa frase es igual a “eureka” 
//el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
//Nota: investigar la función equals() en Java.

