/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_e3;

import guia_10_e3.Alumno.Alumno;
import guia_10_e3.AlumnoServicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Guia_10_e3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        ArrayList<Alumno> alum = new ArrayList<>();
        AlumnoServicio as = new AlumnoServicio();
        String sal;
        do {
           
           alum.add(as.crerAlumno());
            System.out.println("Desea ingresar otro alumno?");
            sal = read.nextLine();
            
                     
            
        } while ("s".equals(sal));
        
        for (Alumno alumno : alum) {
            System.out.println(alumno); 
        }
  System.out.println("Nota final: "+ as.notaFinal(alum));
        
    }

}
