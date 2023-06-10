package guia_11.Main;

import Entity.E1Dog;
import Entity.E1Person;
import EntityService.DogService;
import EntityService.PersonService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Realizar un programa para que una Persona pueda adoptar un Perro.
 * Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
 * y la clase Persona con atributos: nombre, apellido, edad, documento y Perro. 
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que pensar 
 * la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase Persona,
 * la información del Perro y de la Persona.
 */
public class G11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        DogService ds = new DogService();
        ArrayList<E1Dog> listDog = new ArrayList<E1Dog>();

        PersonService ps = new PersonService();
        ArrayList<E1Person> listPerson = new ArrayList<E1Person>();

        // Agrego 4 perros
        ds.bornDog(listDog);

        // Agrego 3 personas
        ps.addPerson(listPerson);
        boolean flat= true;

        do {
            System.out.println(listDog.get(0).getName().equalsIgnoreCase("rufo"));
            System.out.println("*******Sistema de adopción de perros******");
            System.out.println("     ");
            System.out.println("Que desea realizar ???");
            System.out.println("     ");
            System.out.println("1 - Lista de personas anotadas.");
            System.out.println("2 - Lista de perros en espera de adopción.");
            System.out.println("3 - Adoptar un perro.");
            System.out.println("0 - Salir.");
            System.out.println("----------------------------------------------");

            System.out.println("Elija la opción deseada");
            int var = read.nextInt();
           
            switch (var) {
                case 1:
                    ps.showPerson(listPerson);
                    break;

                case 2:
                    ps.showDog(listDog);

                    break;
                case 3:
                    ps.chooseDog(listPerson, listDog);
                    break;

                case 0:
                    System.out.println("Gracias por utilizar el sistema");
                    System.out.println("   ");
                    flat = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta.");
                        System.out.println("   ");
                    break;
                       
            }
        } while (flat);

    } 
    
}
