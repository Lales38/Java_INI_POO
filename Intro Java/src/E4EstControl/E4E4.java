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
public class E4E4 {

    public static void main(String[] args) {
        String palabra;
        String ini;
        int pos;
        Scanner read = new Scanner (System.in);
        palabra = read.nextLine();
        ini = palabra.substring(0,1);
      
            if (ini == "a") {
                System.out.println("Correcto"); 
            }else{
                System.out.println("Incorrecto");
            }
      
    }
}
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’,se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.

*/