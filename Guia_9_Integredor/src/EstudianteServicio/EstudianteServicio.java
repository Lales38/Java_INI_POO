package EstudianteServicio;

import Estudiante.Estudiante;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class EstudianteServicio {

    Estudiante alumno = new Estudiante();
    Scanner read = new Scanner(System.in);
    double sumaNotas = 0;

    public Estudiante[] cargarVector(Estudiante est[]) {
        for (int i = 0; i < est.length; i++) {
            System.out.println("Ingrese el numbre del alumno:");
            System.out.print(">>");
            est[i].setNombre(read.nextLine());
            est[i].setNota(Math.floor(Math.random() * 10 + 1));
        }
        return est;
    }
    ////    public String[] cargarAlumno(String[] alumno) {
    //        Scanner read = new Scanner(System.in).useDelimiter("\n");
    //
    //        for (int i = 0; i < alumno.length; i++) {
    //
    //            System.out.println("Ingrese el nombre del alumno: ");
    //            System.out.print(">>");
    //            alumno[i] = read.nextLine();
    //
    //        }
    //        return alumno;
    //    }
    //
    //    public double[] cargarNota(double[] nota) {
    //
    //        for (int i = 0; i < nota.length; i++) {
    //
    //            nota[i] = (int) Math.floor(Math.random() * 10 + 1);
    //
    //        }
    //        return nota;
    //    }

    /*
    Calcular y mostrar el promedio de notas de todo el curso
     */
    public double calcularProm(Estudiante[] est) {
        double calcularProm = 0;

        return calcularProm;

    }
//    public double calcularPromedio(double[] nota) {
//        double prom = 0;
//
//        for (int i = 0; i < nota.length; i++) {
//            prom = prom + nota[i];
//        }
//        // System.out.println("El promedio de nota es: " + prom / nota.length);
//        return prom / nota.length;
//
//    }

    /*
    Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
     */
    public String[] AlumSobreProm(Estudiante est[], double prom, String sobreProm[]) {

        return sobreProm;
    }
//    public String[] AlumnoSobrePromedio(double[] nota, double prom, String[] alumno, String[] sobrepromedio) {
//        for (int i = 0; i < nota.length; i++) {
//            if (nota[i] > prom) {
//                sobrepromedio[i] = alumno[i];
//            }
//        }
//        return sobrepromedio;
//
//    }

}
