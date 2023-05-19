package guia8app.Servicios;

import guia8app.Entidades.Persona;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class PersonaService {

    public PersonaService() {

    }

    public String getNombre(Persona n) {
        return n.getNombre();
    }

    public boolean esMayorDeEdad(Persona n) {
        /*
          Método esMayorDeEdad(): indica si la persona es mayor de edad.
          La función devuelve un booleano.
         */
        return (n.getEdad() >= 18);
    }

    public Persona crearPersona() {
        /*
        Metodo crearPersona(): el método crear persona, le pide los valores de
        los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Persona. Además, comprueba que el
        sexo introducido sea correcto, es decir, H, M o O. Si no es correcto 
        se deberá mostrar un mensaje
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el Nombre :");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el Edad :");
        int edad = leer.nextInt();

        System.out.println("Ingrese el Sexo H/M/O : ");

        String sexo = leer.next();

        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println(" Usted Ingreso mal el Sexo, vuelva a ingresarlo :");
            sexo = leer.nextLine();
        }

        System.out.println("Ingrese el Peso :");
        int peso = leer.nextInt();

        System.out.println("Ingrese el Altura en Centimetros :");
        int altura = leer.nextInt();

        return new Persona(nombre, edad, sexo, peso, altura);

    }
}
