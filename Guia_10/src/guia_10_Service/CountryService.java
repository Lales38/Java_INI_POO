package guia_10_Service;

import Utility.Comparador;
import guia_10_Object.Countries;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class CountryService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Countries> addCountries(HashSet<Countries> addCountry) {
        String resp;

        do {
            Countries aux = new Countries();
            System.out.println("Ingrese el nombre del pais: ");
            aux.setCountry(read.next());

            addCountry.add(aux);
            do {
                System.out.println("Desea ingresar otro pais? (s/n)");
                resp = read.next().toLowerCase();

            } while (!resp.equals("s") && !resp.equals("n"));

        } while ("s".equalsIgnoreCase(resp));

        return addCountry;

    }

    public void showCountries(HashSet<Countries> addCountry) {
        System.out.println("------Paises en el conjunto------");

        addCountry.forEach((countries) -> {
            System.out.println(" Pais " + countries.getCountry());
        });
        System.out.println("----------------------------");
    }

    public void orderABC(HashSet<Countries> addCountry) {
        ArrayList<Countries> countryABC = new ArrayList(addCountry);
        countryABC.sort(Comparador.orderCountry);
        System.out.println("------Paises ordenados------");

        for (Countries aux : countryABC) {
            System.out.println(aux.getCountry());
        }
        System.out.println("----------------------------");
    }

    public HashSet searchCountry(HashSet<Countries> addCountry) {
        Iterator<Countries> it = addCountry.iterator();//Creamos el iterador para poder recorrer la lista y poder borrar

        String sal;
        do {
            boolean flat = false; //usamos banderas para validar existencia del pais  en el conjunto

            System.out.println("Ingrese un pais: ");
            System.out.print(">>");
            String coun = read.next();
            
            while (it.hasNext()) {
                String aux= it.next().getCountry();
                if (aux.equals(coun)) {//compara el pais ingresado con cada pais del conjunto
                    it.remove();
                    flat = true;
                }

            }
            if (!flat) {
                System.out.println("El pais ingresado no se encuentra en el conjunto.");
            }
            do {
                System.out.println("Desea ingresar otro pais a eliminar?");
                System.out.print(">>");
                sal = read.next().toLowerCase();

            } while (!sal.equals("s") && !sal.equals("n"));

        } while ("s".equalsIgnoreCase(sal));
        return addCountry;

    }

}
