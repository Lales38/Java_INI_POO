/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entity.Alojamiento;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Guia_12_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        
        boolean salir = true;
        do {
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("ALOJAMIENTOS");
            System.out.println("-------------");
            System.out.println("OPCIONES");
            System.out.println("1-MOSTRAR TODOS LOS ALOJAMIENTOS");
            System.out.println("2-MOSTRAR HOTELES POR PRECIO MÁS CARO AL MÁS BARATO");
            System.out.println("3-MOSTRAR TODOS LOS CAMPINGS CON RESTAURANTE");
            System.out.println("4-MOSTRAR TODAS LAS RESIDENCIAS CON DESCUENTO");
            System.out.println("0-SALIR");
            System.out.println("-------------");
            System.out.println("Elija una opción:");
            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    for (Alojamiento mostrarAlojamientos : listaAlojamientos) {
                        System.out.println(mostrarAlojamientos);
                    }
                    break;
                case 2:
                    ArrayList<Hotel> listaHoteles = new ArrayList();
                    for (Alojamiento listaAlojamiento : listaAlojamientos) {
                        if (listaAlojamiento instanceof Hotel) {
                            listaHoteles.add((Hotel) listaAlojamiento);
                        }
                    }
                    Collections.sort(listaHoteles, new Comparator<Hotel>() {
                        public int compare(Hotel h1, Hotel h2) {
                            return Double.compare(h2.getPrecioHabitaciones(), h1.getPrecioHabitaciones());
                        }
                    });

                    for (Alojamiento mostrarHoteles : listaHoteles) {
                        System.out.println(mostrarHoteles);
                    }
                    break;
                case 3:
                    for (Alojamiento mostrarCampingR : listaAlojamientos) {
                        if (mostrarCampingR instanceof Camping) {
                            if (((Camping) mostrarCampingR).isRestaurante()) {
                                System.out.println(mostrarCampingR);
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento mostrarResidenciaD : listaAlojamientos) {
                        if (mostrarResidenciaD instanceof Residencia) {
                            if (((Residencia) mostrarResidenciaD).isDescuentos()) {
                                System.out.println(mostrarResidenciaD);
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("USTED SELECCIONO SALIR");
                    salir = false;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida");
            }
        } while (salir);
        
        
        
        
        
        
        
    }
    
}
