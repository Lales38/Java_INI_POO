/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EstrucControlExtras;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ControlExtra2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int A, B, C, D, X;

        System.out.println("Ingrese un valor entero: ");
        A = read.nextInt();
        System.out.println("Ingrese un valor entero: ");
        B = read.nextInt();
        System.out.println("Ingrese un valor entero: ");
        C = read.nextInt();
        System.out.println("Ingrese un valor entero: ");
        D = read.nextInt();
        
        System.out.println("El valor de A es:" + A);
        System.out.println("El valor de B es:" + B);
        System.out.println("El valor de C es:" + C);
        System.out.println("El valor de D es:" + D);
        
        X=B;
        B=C;
        C=A;
        A=D;
        D=X;
        
        System.out.println("El valor de A es:" + A);
        System.out.println("El valor de B es:" + B);
        System.out.println("El valor de C es:" + C);
        System.out.println("El valor de D es:" + D);
        

    }

}
