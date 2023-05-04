/*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 
 */
package guia8app.Servicios;

import guia8app.Entidades.Cafetera;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class CafeteraServicio {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera() {
        Cafetera cafe1 = new Cafetera();
        System.out.println("Ingrese la cantidad de cafe actual: ");
        System.out.print(">>");
        cafe1.setActual(read.nextInt());
        cafe1.setMax(cafe1.getActual());

        System.out.println("Actual: " + cafe1.getActual());
        System.out.println("Máximo: " + cafe1.getMax());
        return cafe1;
    }

    public void tamTaza(Cafetera cafe1) {

        System.out.println("Ingrese la capacidad de la taza: ");
        System.out.print(">>");

        int tamaTaza = read.nextInt();

        if (tamaTaza < cafe1.getActual()) {
            cafe1.setActual(cafe1.getActual() - tamaTaza);
            System.out.println("Se sirvió la taza de cafe.");
            System.out.println("La catindad restante es :" + cafe1.getActual());

        } else {
            System.out.println("La taza no se lleno.");
            System.out.println("Se sirvió: " + cafe1.getActual());
            cafe1.setActual(0);

        }
    }
    
    public void vaciar(Cafetera cafe1){
        
        cafe1.setActual(0);
        System.out.println("La cafetera está vacia!!!");
    }
    
    public void agregar(Cafetera cafe1){
        System.out.println("Ingrese la cantidad agregada: ");
        System.out.print(">>");
        cafe1.setActual(cafe1.getActual()+ read.nextInt());
        cafe1.setMax(cafe1.getActual());
        System.out.println("La cantidad máxima es :"+ cafe1.getMax());
    }
    
}
