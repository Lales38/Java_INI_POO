package guia_9_main;

import guia_9.Servicios.ArregolServicio;

/**
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 *
 * @author Alejandro
 */
public class Guia_9_e3 {

    /**
     * @param args the command line arguments En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
     */
    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];

        ArregolServicio as = new ArregolServicio();
        as.inicializar(a);
        as.mostrarArrreglo(a);
        as.ordenar(a);
        as.inicializarb(b, a);
        as.inicializar(a);
        as.mostrarArrreglo(a);
        as.ordenar(a);
        as.inicializarb(b, a);

    }

}
