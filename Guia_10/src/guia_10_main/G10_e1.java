/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_main;

import guia_10_Service.RazzaPerroServicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G10_e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> RP = new ArrayList(); //Creo un ArrayList donde guardar las razas

        RazzaPerroServicio rps = new RazzaPerroServicio();
        String resp;
        
        do {
            System.out.println("Desea ingresar una raza de perro? (s/n) ");
            System.out.print(">>");
            resp = read.next().toLowerCase();
            switch (resp) {
                case "s":
                    RP.add(rps.pedirRaza());
                    break;
                case "n":
                    System.out.println("Gracias por utilizar la App");
                    break;
                
                default:
                    System.out.println("El dato ingresado es incorrecto!!!");
                    System.out.println(" ");
                
            }
            
        } while (!resp.equals("n"));
        
        System.out.println("Las razas guardadas son: ");
        RP.forEach((string) -> {
            System.out.println(string);
        });
        
        rps.buscarRaza(RP);
        
        Collections.sort(RP);
        
        System.out.println("Las razas guardadas son: ");
        RP.forEach((string) -> {
            System.out.println(string);
        });
    }
    
}
