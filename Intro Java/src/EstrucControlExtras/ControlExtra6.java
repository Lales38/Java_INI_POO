/*
 Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package EstrucControlExtras;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ControlExtra6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int person, cont1, cont2;
        float h, h1, h2, p1, p2;
        cont1 = 0;
        cont2 = 0;
        h1 = 0;
        h2 = 0;
        System.out.println("Ingrese la cantidad de personas a medir:");
        System.out.print(">>");
        person = read.nextInt();

        for (int i = 1; i <= person; i++) {
            System.out.println("Ingrea la altura de la persona, " + i);
            h = read.nextFloat();

            if (h < 1.60) {
                cont1 = cont1+1;
                h1 = h1 + h;
            }
            h2 = h2 + h;
        }
        p1 = h1 / cont1;
        p2 = h2 / person;
        
        System.out.println("El promedio general de alturas de las personas es:" + p2);
        System.out.println("El promedio de alturas de las personas menores a 1.60m es," + p1);
    }
}

