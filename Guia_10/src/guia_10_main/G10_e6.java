package guia_10_main;

import guia_10_Service.ProducService;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Alejandro Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el precio que tendrán. Además, se necesita que la aplicación cuente con las funciones básicas. Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class G10_e6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ProducService ps = new ProducService();
        HashMap<String, Double> mapItem = new HashMap();
        int op;
        String sal = "s";

        mapItem.put("Coca Cola", 450.0);
        mapItem.put("Azucar", 499.99);
        mapItem.put("Alfajor", 180.80);
        mapItem.put("Manteca", 670.99);

        do {

            System.out.println("------- Lista de tareas --------");
            System.out.println("1 - Mostrar Productos.");
            System.out.println("2 - Agregar productos.");
            System.out.println("3 - Cambiar precios de productos.");
            System.out.println("4 - Eliminar productos.");
            System.out.println("0 - Salir.");
            System.out.println("--------------------------------");
            System.out.println("   ");
            System.out.println("Ingrese una opción: ");
            System.out.print(">>");
            op = read.nextInt();
            
            switch (op) {
                case 1:
                    ps.showAllProduc(mapItem);                    
                    break;
                case 2:
                    ps.addNewProduc(mapItem); 
                    break;
                case 3:
                    ps.changePrice(mapItem);
                    break;
                case 4:
                    ps.deleteProduc(mapItem);
                    break;
                case 0:
                    sal="n";
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta.");
                    System.out.println("  ");
            }

        } while (sal.equals("s"));     
        
    }

}
