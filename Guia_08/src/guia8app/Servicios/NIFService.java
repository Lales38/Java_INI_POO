/*
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según

 */
package guia8app.Servicios;

import guia8app.Entidades.NIF;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class NIFService {

    //"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"
    public void llenarArreglo() {

        String[] vnif = null;
        String letras = "TRWAGMYFPODBNJZSQVHLCKE";

        for (int i = 0; i < letras.length(); i++) {

            vnif[i] = letras.substring(i, i);

        }

    }

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    NIF n1 = new NIF();

    public NIF creaNIF() {
         String[] vnif = null;
        String letras = "TRWAGMYFPODBNJZSQVHLCKE";

        for (int i = 0; i < letras.length(); i++) {

            vnif[i] = letras.substring(i, i);

        }

        int a;

        System.out.println("Ingrese el DNI deseado: ");
        System.out.print(">>");
        n1.setDni(read.nextLong());
        //boolean f = false;
        //long a = n1.getDni();
        a = (int) (n1.getDni() % 23);

        n1.setLetra(vnif[a]);
        return n1;
    }

    public NIF mostrar(long dni, String letra) {
        System.out.println("El NIF es: " + n1.getDni() + " - " + n1.getLetra());

        return n1;
    }

    

}

