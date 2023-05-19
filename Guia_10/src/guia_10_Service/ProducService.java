package guia_10_Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Alejandro
 */
public class ProducService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

//Agregar productos
    public void addNewProduc(HashMap<String, Double> pro) {

        String name;
        double price;
        String sal;

        do {
            System.out.println("Ingrese el nombre del producto a agregar: ");
            System.out.print(">>");
            name = read.next();

            System.out.println("Ingrese el precio del producto:");
            System.out.print(">>");
            price = read.nextDouble();

            pro.put(name, price);

            do {
                System.out.println("Desea ingresar un producto mas? (s/n)");
                sal = read.next();

            } while (!sal.equals("s") && !sal.equals("n"));

        } while ("s".equalsIgnoreCase(sal));
    }
// Mostrar los productos y sus precios
    public void showAllProduc(HashMap<String, Double> pro) {
        
        TreeMap<String, Double> t = new TreeMap(pro);//Paso el hashMap a treemap para ordenarlo     
        
        System.out.println("--------Lista de productos--------");
        
        for (Map.Entry<String, Double> aux : t.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            System.out.println("Producto " + key + ", $ " + value);           
        }
        System.out.println("-----------------------------------");
        System.out.println("  ");
    }
    
//modificar el precio a un producto
    public void changePrice(HashMap<String, Double> pro) {
        String name, sal;
       
        do {
            System.out.println("Ingrese el nombre del producto a modificar: ");
            System.out.print(">>");
            name = read.next();
            if (pro.containsKey(name)) {                
            
            System.out.println("Ingrese el nuevo precio del producto:");
            System.out.print(">>");
            
            pro.replace(name, read.nextDouble());
            } else {
                System.out.println("El producto no se encuentra en el conjunto. ");
            }
            do {
                System.out.println("Desea modificar un producto mas? (s/n)");
                sal = read.next();

            } while (!sal.equals("s") && !sal.equals("n"));

        } while ("s".equalsIgnoreCase(sal));
    }
    
//eliminar un producto 
    public void deleteProduc(HashMap<String, Double> pro) {
        String name, sal;

        do {
            System.out.println("Ingrese el nombre del producto a eliminar: ");
            System.out.print(">>");
            name = read.next();
            if (pro.containsKey(name)) {
                pro.remove(name);
                System.out.println("El producto fue eliminado.");
            } else {
                System.out.println("El producto no se encuentra en el conjunto.");
            }
            do {
                System.out.println("Desea eliminar un producto mas? (s/n)");
                sal = read.next();
            } while (!sal.equals("s") && !sal.equals("n"));
        } while ("s".equalsIgnoreCase(sal));
    }
}
