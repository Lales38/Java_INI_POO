/*
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package Guia_5;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class G5_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector :");
        System.out.print(">>");
        int t = read.nextInt();
        int varios[] = new int[t];

        Random aleatorio = new Random();
        for (int i = 0; i < t; i++) {
            varios[i] = aleatorio.nextInt(20 - 0 + 1) + 0;

        }
        for (int i = 0; i < t; i++) {
            System.out.println(""+varios[i]);
            
        }
        System.out.println("Ingrese un numero a buscar: ");
        System.out.print(">>");
        int b = read.nextInt();
        boolean bandera = false;
        
        for (int i = 0; i < t; i++) {
            if (b == varios[i]) {
                System.out.println("El número " + b + " se encuentra en la posición: " + i);
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("El número " + b + "  NO se encuentra en el vector");
        }
        
    }
}
