package guia_10_Object;


import java.util.ArrayList;
import java.util.List;

/**
  * @author Alejandro
 */
public class Alumno {
    
    private String alumno;
    private ArrayList <Integer> notas ;

    public Alumno() {
    }

    public Alumno(String alumno, List<Integer> notas) {
        this.alumno = alumno;
        this.notas = (ArrayList<Integer>) notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = (ArrayList<Integer>) notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", notas=" + notas + '}';
    }

    
    
    
    

}
