/*
 Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package EstrucControlExtras;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ControlExtra5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String tipo;
        int costo;
        double importe;
        do {

            System.out.println("Ingrese que tipo de plan tiene:");
            System.out.println("A, B, C, S para salir");
            System.out.print(">>");
            tipo = read.next().toUpperCase();

            switch (tipo) {
                case "A":
                    System.out.println("Ingrese el costo del tratamiento:");
                    System.out.print(">>");
                    costo = read.nextInt();
                    importe = costo * 0.50;
                    System.out.println("Su plan tiene un descuento del 50%.");
                    System.out.println("El importe a abonar es de, " + importe);
                    break;
                case "B":
                    System.out.println("Ingrese el costo del tratamiento:");
                    System.out.print(">>");
                    costo = read.nextInt();
                    importe = costo - (costo * 0.35);
                    System.out.println("Su plan tiene un descuento del 35%");
                    System.out.println("El importe a abonar es de, " + importe);
                    break;
                case "C":
                    System.out.println("Ingrese el costo del tratamiento:");
                    System.out.print(">>");
                    costo = read.nextInt();
                    importe = costo;
                    System.out.println("Su plan NO tiene descuento en tratamientos. ");
                    System.out.println("El importe a abonar es de, " + importe);
                    break;
                case "S":
                    System.out.println("Gracias por su cosulta. ");
                    break;
                default:
                    System.out.println("El plan selecionado no existe!!");

            }

        } while (!"S".equals(tipo));
    }
}
