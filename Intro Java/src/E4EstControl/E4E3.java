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
public class E4E3 {

    public static void main(String[] args) {
        String palabra;
        int largo;
        Scanner read = new Scanner (System.in);
        
        do
        { 
        System.out.println("Ingrese una palabra:");
        palabra = read.next();
        largo = palabra.length();
            if (largo==8) {
                System.out.println("Correcto"); 
            }else{
                System.out.println("Incorrecto");
            }
        }while (largo!=8);
    }

}
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.

*/