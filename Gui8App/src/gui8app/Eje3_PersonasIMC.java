package gui8app;

import guia8app.Entidades.Person;
import guia8app.Servicios.PersonService;

/**
  * @author Alejandro
 */
public class Eje3_PersonasIMC {
    public static void main(String[] args) {
        
        // Crear 4 Obtejos de persona
        
        PersonService n1 = new PersonService();
        Person p1 = n1.crearPersona();
        Person p2 = n1.crearPersona();
        Person p3 = n1.crearPersona();
        Person p4 = n1.crearPersona();
        
        Person [] Vector = new Person[4];
        
        Vector [0] = p1;
        Vector [1] = p2;
        Vector [2] = p3;
        Vector [3] = p4;
        
        for (int i = 0; i < 4; i++) {
            Person p = Vector[i];
            if (n1.esMayorDeEdad(p)){
                System.out.println(n1.getNombre(p) + " : Es Mayor de Edad"  );
            }else{
                System.out.println(n1.getNombre(p) + " Es Menor de Edad");
            }
            switch (n1.calcularIMC(p)) {
                case 1:
                    System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                case 0:
                    System.out.println(n1.getNombre(p) + " : Peso Ideal");
                case -1:
                    System.out.println(n1.getNombre(p) + " : Arriva del Peso ideal");
            }
        }
    }
}
        
    

