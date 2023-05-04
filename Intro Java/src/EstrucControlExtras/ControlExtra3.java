/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package EstrucControlExtras;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ControlExtra3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String letra;
        System.out.println("Ingrese un caracter:");
        letra = read.next().toLowerCase();

        if (letra.equals("a")) {
        } else if (letra.equals("e")) {
        }   else if (letra.equals("i")) {
        }       else if (letra.equals("o")) {
        }           else if (letra.equals("u")){                      
        }               else{
                        System.out.println("El caracter ingresado NO es una vocal.");
        }

    }
}
/* switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                break;
            default:
                System.out.println("El caracter ingresado NO es una vocal.");
           }
 */
