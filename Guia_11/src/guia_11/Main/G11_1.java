package guia_11.Main;

import Entity.E1Dog;
import Entity.E1Person;
import EntityService.DogService;
import EntityService.PersonService;
import java.util.ArrayList;
/**
 *
 * @author Alejandro
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class G11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DogService ds = new DogService();
        ArrayList <E1Dog> listDog = new ArrayList <E1Dog>();
        
        PersonService ps = new PersonService();
        ArrayList <E1Person> listPerson = new ArrayList <E1Person>();
        
        // Agrego 4 perros
        ds.bornDog(listDog);
        
        // Agrego 3 personas
        ps.addPerson(listPerson);
        
        //Muestro personas
        
         ps.showPerson(listPerson);
         
         //Elegir perros
        
        ps.chooseDog(listPerson, listDog);
        
       
        


    }

}
