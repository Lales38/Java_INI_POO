package gui8app;

import guia8app.Entidades.Cafetera;
import guia8app.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class Eje2_Cafetera {

    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera ca = cs.llenarCafetera();
        //cs.tamTaza(ca);
        //cs.vaciar(ca);
        //cs.agregar(ca);
        boolean s = false;
        Scanner read = new Scanner(System.in);

        int op;
        do {
            System.out.println("-------------------------------");
            System.out.println("1 - Llenar cafetera:");
            System.out.println("2 - Servir taza de cafe:");
            System.out.println("3 - Vaciar cafetera.");
            System.out.println("4 - Agregar cafe.");
            System.out.println("0 - Salir");
            System.out.println("-------------------------------");
            System.out.println("Elija una opción");
            op = read.nextInt();
            switch (op) {
                case 1:
                    cs.llenarCafetera();
                    break;
                case 2:
                    cs.tamTaza(ca);
                    break;
                case 3:
                    cs.vaciar(ca);
                    break;
                case 4:
                    cs.agregar(ca);
                    break;
                case 0:
                    s = true;
                    System.out.println("Eligió salir");
                    break;

                default:
                    System.out.println("La opción es incorrecta100");;
            }

        } while (s != true);

    }

}
