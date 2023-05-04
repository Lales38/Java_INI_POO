/*
Crea una aplicación que nos pida un número por teclado y con una función
se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
17 si es primo.
 */
package Encuentro_4;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc4_encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entre el 1 y el 100 : ");
        int num = read.nextInt();

        System.out.println("El número ingresado " + num + " es primo??: "+ primo(num));
    }

    public static boolean primo(int num) {
        boolean confirmacion = true;
        if (num>=2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    confirmacion = false;
                    break;
                }
                
            }
        }

        return confirmacion;
    }

}