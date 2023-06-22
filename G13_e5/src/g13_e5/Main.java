/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento. */
package g13_e5;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int a = (int) (Math.random() * 7 + 1);
        System.out.println(a);
        int b = 0;
        int cont = 0;

        do {
            do {
                try {
                    System.out.println("Ingrese un número entre 1 y 7: ");
                    b = read.nextInt();
                    cont++;

                } catch (Exception e) {
                    System.err.println("El dato ingresado es incorrecto");
                    cont++;
                    read.next();//es para limpiar el buffer(si no se escribe queda en loop)
                }

                if (b < 0 || b > 7) {
                    System.err.println("El nùmero ingresado esta fuera del rango!!!!");
                }
            } while (b < 0 || b > 7);

            if (b < a) {
                System.out.println("El número secreto es mayor");

            } else if (b > a) {
                System.out.println("El número secreto es menor");
            } else {
                System.out.println("Adivinaste!!!!!");
            }

        } while (a != b);
        System.out.println("===========================");
        System.out.println("El número secreto es " + b);
        System.out.println("La cantidad de intentos es de: " + cont);
        System.out.println("===========================");

    }

}
