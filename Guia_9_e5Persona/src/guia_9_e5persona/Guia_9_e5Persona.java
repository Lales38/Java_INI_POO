/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_e5persona;

import PersonaServicio.PersonaServicio;
import guia_9_e5persona.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Guia_9_e5Persona {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio Ps = new PersonaServicio();
        Persona p1 = Ps.crearPersona();
        
        System.out.println("Ingrese la edad a comparar: ");
        System.out.print(">>");
        int edad = read.nextInt();
        System.out.println("La persona es menor que la edad ingresada: "+ Ps.menorQue(p1, edad));
        
        Ps.mostrarPersona(p1);
        
    }
    
}
