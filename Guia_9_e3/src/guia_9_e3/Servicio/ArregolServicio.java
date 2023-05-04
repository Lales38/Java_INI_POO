package guia_9_e3.Servicio;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 *
 * @author Alejandro
 */
public class ArregolServicio {

    DecimalFormat form1 = new DecimalFormat("#.00");

    /*
    Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
     */
    public double[] inicializar(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.floor(Math.random() * 100 + 50);
        }
        //Arrays.fill(a, Math.random() * 100);

        return a;

    }

    /*
    Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
     */
    public void mostrarArrreglo(double[] a) {
        /* for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }*/
        System.out.println(Arrays.toString(a));
        //System.out.println(form1.format(Arrays.toString(a)));
    }

    /*
     Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
     collection.reverseOrden();
    
     */
    public void ordenar(double[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i = a.length; i > 0; i--) {
            System.out.print(a[i - 1] + ", ");

        }
        System.out.println(" ");

    }

    /*
    Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    Arrays.fill(arreglo, int desde, int  hasta, variable)

     */
    public double[] inicializarb(double[] b, double[] a) {
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        Arrays.fill(b, 10, 20, 0.5);
        System.out.println(Arrays.toString(b));
        return b;
    }

}
