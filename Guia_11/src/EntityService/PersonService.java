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

        listPerson.add(new E1Person("Andres", "Gutierrez", 34, 23456789));

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
    //Muestro la persona que va a adoptar
    //Muestro la lista de perros
    //Elijo el perro

    public void chooseDog(ArrayList<E1Person> listPerson, ArrayList<E1Dog> listDog) {
        for (int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i).getName() + " , lista de mascotas a adoptar: ");
            System.out.println("  ");
            int elegido;
            for (int j = 0; j < listDog.size(); j++) {
                System.out.print("Opción : " + (j + 1));
                System.out.println("  nombre = " + listDog.get(j).getName());
            }
            
                System.out.println("  ");
                System.out.println("Elija la opción del perro a adoptar: ");
                elegido = read.nextInt() - 1;

                if (listDog.get(elegido).isAdoptado() == true) {
                    System.out.println("El nombre elegido ya esta adoptado:");
                    i=i-1;
                } else {

                    listPerson.get(i).setDog(listDog.get(elegido));
                    listDog.get(elegido).setAdoptado(true);
                    System.out.println(listPerson.get(i).getName()+", adoptaste a "+ listDog.toString());

                }
            
        }

    }



public void showPerson(ArrayList<E1Person> listPerson) {
        System.out.println("------------Lista de personas -----------------");

        for (E1Person aux : listPerson) {
            System.out.println("Lis Per = " + aux);

        }
        System.out.println("----------------------------------------");

    }

    public void showDog(ArrayList<E1Dog> listDog) {
        int cont = 0;
        for (E1Dog aux : listDog) {
            System.out.println("Opción " + cont);
            System.out.println("aux = " + aux.toString());
            cont += 1;
        }
    }
}
