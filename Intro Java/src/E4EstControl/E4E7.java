/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a 
continuacion solicite numeros al usuario hasta que la suma de los numeros 
introducidos supere el límite inicial.
 */
package E4EstControl;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class E4E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String codigo;
        int cont = 0, cont2 = 0;
        System.out.println("Ingrese el codigo");
        codigo = read.nextLine();
        while (!codigo.equals("&&&&&")) {
            if (codigo.length() == 5) {
                if (codigo.substring(0, 1).equals("X") && codigo.substring(4, 5).equals("O")) {
                    cont = cont + 1;
                } else {
                    cont2 = cont2 + 1;
                }
            } else {
                cont2 = cont2 + 1;
            }
            System.out.println("Ingrese el codigo");
            codigo = read.nextLine().toUpperCase();
        }
        System.out.println("La cantidad de codigos correctos son " + cont
                + " mientras que la cantidad de incorrectos es " + cont2);
    }

}
