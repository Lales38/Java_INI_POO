/*
 Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package Guia_5;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class G5_Extras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz: ");
        System.out.print(">>");
        int n = read.nextInt();
        System.out.print(">>");
        int m = read.nextInt();

        int matriz[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
                System.out.println(matriz[i][j]);
            }

        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma =suma + matriz[i][j];
            }

        }
        
        System.out.println("La suma de los valores de la matriz es: "+ suma);
    }
    
   
}
