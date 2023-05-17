package guia_10_e1.RazaPerroServicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class RazzaPerroServicio {

    public String pedirRaza() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una raza de perro: ");
        System.out.print(">>");

        String aux = read.next();

        return aux;

    }

    public ArrayList buscarRaza(ArrayList<String> RP) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Iterator<String> it= RP.iterator();//Creamos el iterador para poder recorrer la lista y poder borrar
        
        System.out.println("Ingrese la raza a buscar: ");
        System.out.print(">>");
        String razaBuscada = read.nextLine();
        
        boolean ban= false;
       
        while (it.hasNext()) {
            if (it.next().equals(razaBuscada)) {//valida si coincide la palabra 
                it.remove();//si la encuentra la elimina
                ban =true;
            }
            
        }
        if (!ban) {
            System.out.println("La raza ingresada no se encuentra en la lista");
        }
        return RP;

    }

}
