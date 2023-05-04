/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package intro.java;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class E3Teoria11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingres un número entre 1 y 20: ");
            num = read.nextInt();

            while (num < 0 || num > 20) {
                System.out.println("Ingres un número entre 1 y 20: ");
                num = read.nextInt();
            }
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                
                System.out.print(" * "); 
            }
            System.out.println(" ");
        }

    }
}
