/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad 
de compañerosde equipo y define su tipo de dato de tal manera que
te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres
de tus compañeros de equipo

 */
package Guia_5;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class EjeTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String equipo[] = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre: ");
            System.out.print(">>");
            equipo[i] = read.nextLine();

        }
        for (int j = 0; j < 10; j++) {
            System.out.println("El nombre en la posición " + j + " es " + equipo[j]);

        }
    }

}
