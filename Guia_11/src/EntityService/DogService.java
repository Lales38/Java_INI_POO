package EntityService;

import Entity.E1Dog;
import java.util.ArrayList;

/**
  * @author Alejandro
 
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class DogService {
    
    public void bornDog(ArrayList <E1Dog> listDog){
        
      
        
        E1Dog aux = new E1Dog();
        aux.setName("Rufo");
        aux.setBreed("Dalmata");
        aux.setAge(5);
        aux.setSize("mediano");
        
        listDog.add(aux);       
        
        E1Dog aux2 = new E1Dog();
        aux2.setName("Terri");
        aux2.setBreed("Salchicha");
        aux2.setAge(3);
        aux2.setSize("chico");
        
        listDog.add(aux2);  
        
        E1Dog aux3 = new E1Dog();
        aux3.setName("Dafne");
        aux3.setBreed("Cocker");
        aux3.setAge(5);
        aux3.setSize("mediano");
        
        listDog.add(aux3);       
        
        E1Dog aux4 = new E1Dog();
        aux4.setName("Fido");
        aux4.setBreed("BullDog");
        aux4.setAge(9);
        aux4.setSize("mediano");
        
        listDog.add(aux4);  
        
       
    }

}
