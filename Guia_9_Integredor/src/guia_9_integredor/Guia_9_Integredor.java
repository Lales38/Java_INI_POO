
package guia_9_integredor;

import Estudiante.Estudiante;
import EstudianteServicio.EstudianteServicio;
import java.util.Arrays;

/**
 *
 * @author Alejandro
 */
public class Guia_9_Integredor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        String[] alumno = new String[8];
//        double[] nota = new double[8];
//        String[] sobrepromedio = new String[8];
//        EstudianteServicio es = new EstudianteServicio();
//        q
//        es.cargarAlumno(alumno);//        
//        es.cargarNota(nota);//        
//        System.out.println("El promedio de nota es: " + es.calcularPromedio(nota));//        
//        es.AlumnoSobrePromedio(nota, es.calcularPromedio(nota), alumno, sobrepromedio);//              
//        System.out.println(Arrays.toString(sobrepromedio));
        EstudianteServicio es = new EstudianteServicio();
        Estudiante est[] = new Estudiante[8];
        Estudiante nota[] = new Estudiante[8];
        String sobreProm[] = null;

        es.cargarVector(est);
        System.out.println(Arrays.toString(est));
    }

    //          System.out.println("El promedio de notas es: "+ es.calcularProm(est));
//            es.AlumSobreProm(est, es.calcularProm(est), sobreProm);
//            System.out.print("Los alumnos con nota superior al promedio es: "  );
//            System.out.println(Arrays.toString(sobreProm));
}

            