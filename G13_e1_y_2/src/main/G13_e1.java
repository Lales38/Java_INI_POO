/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Persona;
//import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class G13_e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<Persona> listPersona = new ArrayList<>();
        Persona per[]= new Persona[3];

        Persona p1 = new Persona();
        per[0] = p1;

        Persona p2 = new Persona("Ale", 45);
        per[1] = p2;

        Persona p3 = new Persona("Brunii", 12);
        per[2] = p3;

        try {//Es por si los datos del objeto son nullos

            if (p1.esMayor(p1.getEdad())) {
                System.out.println("La persona es mayor de edad");
            } else {
                System.out.println("La persona es menor de edad");
            }
        } catch (Exception e) {
            System.out.println("No se puede determinar la edad de la persona ");
        }
    
       //Es por si buscamos datos en un indice fuera del rango del vector/arrglo
       //ArrayIndexOutOfBoundsException 
       try{
           System.out.println(per[3].getNombre());
           
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("El dato buscado está fuera del rango del arreglo");
       }
       
       
        
        
        
        
    }
    
    

   
}
