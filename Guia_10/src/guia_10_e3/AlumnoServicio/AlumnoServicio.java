package guia_10_e3.AlumnoServicio;

import guia_10_e3.Alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class AlumnoServicio {

    private final Scanner read = new Scanner(System.in);

    public Alumno crerAlumno() {
        
        Alumno aux;
        // ArrayList <Alumno> auxAlum = new ArrayList <>();

        System.out.println("Ingrese el nombre del alumno:");
        String nom = read.next();

        ArrayList<Integer> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            notas.add(read.nextInt());

        }
        aux = new Alumno(nom, notas);

        return aux;

    }
     public double notaFinal(ArrayList<Alumno> alm){ // alumnos(a1, a2, a3)
        
         String nomb; int acum=0; int cantNotas=0;
       
         System.out.println("Ingrese el nombre del alumno que desea saber la nota final");
       
         nomb=read.next();
        
         for (Alumno aux: alm) {
            
             if (aux.getAlumno().equals(nomb)) {
              
                 for (Integer auxNotas: aux.getNotas()) {
                 
                     acum=acum+auxNotas;   
                }
                cantNotas= aux.getNotas().size();
            }
        }
    
        return Math.round(acum/cantNotas);

}
}