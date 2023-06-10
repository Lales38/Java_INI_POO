
package G7_Class;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ex3_Juego {

    public int n1;
    public int cantInt;
    public int correctos;

    public Ex3_Juego() {
        correctos = 0;
    }

    public Ex3_Juego(int n1, int cantInt) {
        this.n1 = n1;
        this.cantInt = cantInt;
        correctos = 0;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getCantInt() {
        return cantInt;
    }

    public void setCantInt(int cantInt) {
        this.cantInt = cantInt;
    }

    public int getCorrectos() {
        return correctos;
    }

    public void setCorrectos(int correctos) {
        this.correctos = correctos;
    }

    public void inicio_juego() {

        Scanner read = new Scanner(System.in);
        System.out.println("Tiene la cantida de intentos: " + cantInt);

        int nIngresado;

        for (int i = 0; i < cantInt; i++) {
            System.out.println("Ingrese su número de la suerte: ");
            System.out.print(">>");
            nIngresado = read.nextInt();
            if (nIngresado == n1) {
                System.out.println("Tu número es Correcto !!!!");
                correctos = correctos + 1;
                break;
            } else {
                if (nIngresado < n1) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor");
                }
            }

        }
        if (correctos == 0) {
            System.out.println("No tiene mas intentos.");
        }

    }

}
