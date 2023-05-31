package EntityService;

import Entity.E1Dog;
import Entity.E1Person;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class PersonService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void addPerson(ArrayList<E1Person> listPerson) {
        E1Person p1 = new E1Person();

        p1.setName("Ale");
        p1.setSurname("Salerno");
        p1.setAge(45);
        p1.setDni(26987648);
        listPerson.add(p1);

        E1Person p2 = new E1Person();

        p2.setName("Bru");
        p2.setSurname("Salerno");
        p2.setAge(12);
        p2.setDni(5241469);
        //p2.setDog(listDog);
        listPerson.add(p2);

        E1Person p3 = new E1Person();

        p3.setName("Naty");
        p3.setSurname("Martinez");
        p3.setAge(41);
        p3.setDni(29016754);
        //p2.setDog(listDog);
        listPerson.add(p3);
    }

    public void chooseDog(ArrayList<E1Person> listPerson, ArrayList<E1Dog> listDog) {
        for (int i = 0; i < listPerson.size(); i++) {

            E1Person p1 = listPerson.get(i);
            int op;
            System.out.println("----------Listado de perros -------------");

            do {

                int cont = 1;
                for (E1Dog aux : listDog) {
                    System.out.println("Opción " + cont);
                    System.out.println("aux = " + aux.toString());
                    cont += 1;
                }
                System.out.println("Ingrese una opción: ");

                op = read.nextInt();
                ArrayList<E1Dog> dog = new ArrayList<E1Dog>();
                dog.add(listDog.get(op - 1));
                p1.setDog(dog);
                listDog.remove(op - 1);
                System.out.println("Desea adoptar un perro mas? (s/n)");

            } while ("s".equalsIgnoreCase(read.next()));

        }
    }

    public void showPerson(ArrayList<E1Person> listPerson) {
        System.out.println("------------Lista de personas -----------------");
//        listPerson.forEach( aux -> {
//            System.out.println(aux.toString());
//        });

        
        for (E1Person aux : listPerson) {
            System.out.println("Lis Per = " + aux);
           
           
            System.out.println("----------------------------------------");
          
        }

    }

}
