/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package E4EstControl;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class E4E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int size = read.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size); j++) {
                if (i == 1 || i == size) {
                    System.out.print("*");
                } else if (j == 1 || j == (size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }
}
