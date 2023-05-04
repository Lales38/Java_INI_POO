package PersonaServicio;

import guia_9_e5persona.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class PersonaServicio {

    Persona p1 = new Persona();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    /*
    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.
     */

    /**
     *
     * @return
     */

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona a crear: ");
        System.out.print(">>");
        p1.setNombre(read.nextLine());

        System.out.println("Ingrese día de nacimiento: ");
        System.out.print(">>");
        int dd = read.nextInt();

        System.out.println("Ingrese el mes de nacimiento: ");
        System.out.print(">>");
        int mm = (read.nextInt());

        System.out.println("Ingrese el año de nacimiento: ");
        System.out.print(">>");
        int aa = (read.nextInt());

        p1.setFechaNacimiento(dd, mm, aa);

        return p1;
    }

    /*
    Método calcularEdad que calcule la edad del usuario utilizando el atributo 
    de fecha de nacimiento y la fecha actual.
     */

    /**
     *
     */

    public int calcularEdad() {
        Date FA = new Date();
        FA.getTime();
        
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;

        long difNumerica =FA.getTime() - p1.getNacimiento().getTime();
        
        int difAnios=(int) Math.round(difNumerica/milisegundosPorAno);
        
        //System.out.println("La edad de la persona es : " + difAnios);
   
        return difAnios;
    }

    /*
    Método menorQue recibe como parámetro una Persona y una edad. 
    Retorna true si la persona es menor que la edad consultada o false en caso contrario.
     */

    public boolean menorQue(Persona p1, int edad){
       
       return (p1.getNacimiento().getTime() < edad*1000L * 60L * 60L * 24L * 365L); 
        
    }     
     /*
    Método mostrarPersona que muestra la información de la persona deseada.
     */
    public void mostrarPersona(Persona p1)    {
        
        System.out.println("El nombre es :" + p1.getNombre());
        System.out.println("La fecha de nacimiento es :" + p1.getNacimiento());
        System.out.println("La edad es : " + calcularEdad());
    }    
    
    
}
