package EntityService;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Simulador {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ThreadLocalRandom nAletorio = ThreadLocalRandom.current();

    ArrayList<Alumno> AlumnosVotantes = new ArrayList<>();
    
    ArrayList<String> aluNue = new ArrayList<>();
    ArrayList<Integer> dniNue = new ArrayList<>();

    public ArrayList<String> crearNombCompl() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Carlos", "Laura", "Andrés", "Mónica", "Roberto", "Valeria", "Diego", "Isabel", "Hugo", "Fernanda", "Javier", "Carmen", "Ricardo", "Gabriela", "Sergio", "Paula", "Alejandro", "Daniela", "José", "Elena", "Miguel", "Mariana", "Rosa", "Felipe", "Patricia"};
        String[] apellidos = {"Pérez", "López", "Rodríguez", "García", "Martínez", "Fernández", "Torres", "Ramírez", "Gómez", "Vargas", "Castro", "Herrera", "Morales", "Jiménez", "Ortega", "Ríos", "Silva", "Soto", "Navarro", "Bravo", "Mendoza", "Guzmán", "Paredes", "Rojas", "Castro", "Salazar", "Peña", "Morales", "Muñoz", "Medina"};
        ArrayList<String> nombresAlumnos = new ArrayList<>(Arrays.asList(nombres));
        ArrayList<String> apellidoAlumno = new ArrayList<>(Arrays.asList(apellidos));

        for (int i = 0; i < nombresAlumnos.size(); i++) {
            aluNue.add(nombresAlumnos.get(nAletorio.nextInt(0, nombresAlumnos.size())) + ", " + apellidoAlumno.get(nAletorio.nextInt(0, apellidoAlumno.size())));
            System.out.println(aluNue.get(i));
        }
        return aluNue;
    }

    public void crearDni() {
        HashSet<Integer> dniHash = new HashSet<>();
            for (int i = 0; i < aluNue.size(); i++) {
                dniHash.add(nAletorio.nextInt(5000000,99999999));
        }
       dniNue = new ArrayList(dniHash);

        for (Integer integer : dniNue) {
            System.out.println("integer = " + integer);
        }
    }

    public ArrayList<Alumno> crearAlumno() {
       
        System.out.println("Ingrese la cantidad de alumnos a votar:");
        System.out.println(">>");
        int nVotantes = read.nextInt(); 
        
        
        
        
      return null; 
    }

    public void votacion(ArrayList<Alumno> alumVotado, Alumno alumno) {
    }

    public void recuentoVoto(ArrayList<Alumno> recuAlumno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void facilitadores(ArrayList<Alumno> alumnos) {
    }
}
